package com.jdbc_practice.problems.library_management_system;


import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibrarySystemJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/blabz_db";
    private static final String user = "root";
    private static final String password = "MySql@123";

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-------- Library System --------");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Books");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    viewBooks(con);
                    break;

                case 2:
                    borrowBook(con, sc);
                    break;

                case 3:
                    returnBook(con, sc);
                    break;

                case 4:
                    searchBooks(con, sc);
                    break;

                case 5:
                    con.close();
                    return;
            }
        }
    }

    // VIEW BOOKS
    public static void viewBooks(Connection con) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM book_jdbc");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("book_id") + " | " +
                            rs.getString("title") + " | " +
                            rs.getString("author") + " | Available: " +
                            rs.getInt("available_copies"));
        }
    }

    // BORROW BOOK
    public static void borrowBook(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        PreparedStatement check =
                con.prepareStatement("SELECT available_copies FROM book_jdbc WHERE book_id=?");
        check.setInt(1, bookId);
        ResultSet rs = check.executeQuery();

        if (rs.next() && rs.getInt("available_copies") > 0) {

            con.setAutoCommit(false);

            PreparedStatement update =
                    con.prepareStatement("UPDATE book_jdbc SET available_copies = available_copies - 1 WHERE book_id=?");
            update.setInt(1, bookId);
            update.executeUpdate();

            PreparedStatement insert =
                    con.prepareStatement("INSERT INTO borrow_jdbc (book_id, student_id, borrow_date) VALUES (?, ?, CURDATE())");
            insert.setInt(1, bookId);
            insert.setInt(2, studentId);
            insert.executeUpdate();

            con.commit();
            con.setAutoCommit(true);

            System.out.println("Book Borrowed Successfully!");

        } else {
            System.out.println("Book not available!");
        }
    }

    // RETURN BOOK + FINE CALCULATION
    public static void returnBook(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Borrow ID: ");
        int borrowId = sc.nextInt();

        PreparedStatement ps =
                con.prepareStatement("SELECT borrow_date, book_id FROM borrow_jdbc WHERE borrow_id=?");
        ps.setInt(1, borrowId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            LocalDate borrowDate = rs.getDate("borrow_date").toLocalDate();
            LocalDate returnDate = LocalDate.now();

            long days = ChronoUnit.DAYS.between(borrowDate, returnDate);

            double fine = 0;
            if (days > 7) {
                fine = (days - 7) * 10;  // ₹10 per extra day
            }

            con.setAutoCommit(false);

            PreparedStatement updateBorrow =
                    con.prepareStatement("UPDATE borrow_jdbc SET return_date=CURDATE(), fine=? WHERE borrow_id=?");
            updateBorrow.setDouble(1, fine);
            updateBorrow.setInt(2, borrowId);
            updateBorrow.executeUpdate();

            PreparedStatement updateBook =
                    con.prepareStatement("UPDATE book_jdbc SET available_copies = available_copies + 1 WHERE book_id=?");
            updateBook.setInt(1, rs.getInt("book_id"));
            updateBook.executeUpdate();

            con.commit();
            con.setAutoCommit(true);

            System.out.println("Book Returned! Fine: ₹" + fine);
        }
    }

    // SEARCH BOOKS (Multiple Filters)
    public static void searchBooks(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Title (or press Enter): ");
        String title = sc.nextLine();

        System.out.print("Enter Author (or press Enter): ");
        String author = sc.nextLine();

        System.out.print("Enter Category (or press Enter): ");
        String category = sc.nextLine();

        String query = "SELECT * FROM book_jdbc WHERE 1=1";

        if (!title.isEmpty()) query += " AND title LIKE '%" + title + "%'";
        if (!author.isEmpty()) query += " AND author LIKE '%" + author + "%'";
        if (!category.isEmpty()) query += " AND category LIKE '%" + category + "%'";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getString("title") + " | " + rs.getString("author"));
        }
    }
}
