package com.jdbc_practice.problems.employee_management_system;


import java.sql.*;
import java.util.Scanner;

public class EmployeeJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/blabz_db";
    private static final String user = "root";
    private static final String password = "MySql@123";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            while (true) {
                System.out.println("\n------- Employee Management System --------");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Search Employee by Name");
                System.out.println("6. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        addEmployee(con, sc);
                        break;

                    case 2:
                        viewEmployees(con);
                        break;

                    case 3:
                        updateSalary(con, sc);
                        break;

                    case 4:
                        deleteEmployee(con, sc);
                        break;

                    case 5:
                        searchEmployee(con, sc);
                        break;

                    case 6:
                        con.close();
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ADD EMPLOYEE
    public static void addEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        String query = "INSERT INTO employee_jdbc (name, email, salary) VALUES (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setDouble(3, salary);

        int rows = ps.executeUpdate();

        if (rows > 0)
            System.out.println("Employee Added Successfully!");
    }

    // VIEW ALL EMPLOYEES
    public static void viewEmployees(Connection con) throws SQLException {
        String query = "SELECT * FROM employee_jdbc";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("\n---- Employee List ----");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("email") + " | " +
                    rs.getDouble("salary"));
        }
    }

    // UPDATE SALARY
    public static void updateSalary(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Salary: ");
        double salary = sc.nextDouble();

        String query = "UPDATE employee_jdbc SET salary = ? WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setDouble(1, salary);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();

        if (rows > 0)
            System.out.println("Salary Updated Successfully!");
        else
            System.out.println("Employee Not Found!");
    }

    // DELETE EMPLOYEE
    public static void deleteEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        String query = "DELETE FROM employee_jdbc WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows > 0)
            System.out.println("Employee Deleted Successfully!");
        else
            System.out.println("Employee Not Found!");
    }

    // SEARCH EMPLOYEE BY NAME
    public static void searchEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        String query = "SELECT * FROM employee_jdbc WHERE name LIKE ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, "%" + name + "%");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("email") + " | " +
                    rs.getDouble("salary"));
        }
    }
}
