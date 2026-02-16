package com.jdbc_practice.problems.banking_system;


import java.sql.*;
import java.util.Scanner;

public class BankingSystemJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/blabz_db";
    private static final String user = "root";
    private static final String password = "MySql@123";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n-------- Banking System --------");
                System.out.println("1. Transfer Money");
                System.out.println("2. Check Balance");
                System.out.println("3. Transaction History");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        transferMoney(con, sc);
                        break;

                    case 2:
                        checkBalance(con, sc);
                        break;

                    case 3:
                        transactionHistory(con, sc);
                        break;

                    case 4:
                        con.close();
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // TRANSFER MONEY USING TRANSACTION
    public static void transferMoney(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter From Account ID: ");
        int fromId = sc.nextInt();

        System.out.print("Enter To Account ID: ");
        int toId = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        try {
            con.setAutoCommit(false); // Start Transaction

            // Check balance
            PreparedStatement checkStmt =
                    con.prepareStatement("SELECT balance FROM account_jdbc WHERE account_id = ?");
            checkStmt.setInt(1, fromId);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                System.out.println("From Account not found!");
                return;
            }

            double currentBalance = rs.getDouble("balance");

            if (currentBalance < amount) {
                System.out.println("Insufficient balance!");
                return;
            }

            // Deduct from sender
            PreparedStatement deductStmt =
                    con.prepareStatement("UPDATE account_jdbc SET balance = balance - ? WHERE account_id = ?");
            deductStmt.setDouble(1, amount);
            deductStmt.setInt(2, fromId);
            deductStmt.executeUpdate();

            // Add to receiver
            PreparedStatement addStmt =
                    con.prepareStatement("UPDATE account_jdbc SET balance = balance + ? WHERE account_id = ?");
            addStmt.setDouble(1, amount);
            addStmt.setInt(2, toId);
            addStmt.executeUpdate();

            // Insert transaction record
            PreparedStatement txnStmt =
                    con.prepareStatement("INSERT INTO transaction_jdbc (from_account, to_account, amount) VALUES (?, ?, ?)");
            txnStmt.setInt(1, fromId);
            txnStmt.setInt(2, toId);
            txnStmt.setDouble(3, amount);
            txnStmt.executeUpdate();

            con.commit(); // Commit Transaction
            System.out.println("Money transferred successfully!");

        } catch (Exception e) {
            con.rollback(); // Rollback if any error
            System.out.println("Transaction Failed! Rolled back.");
        } finally {
            con.setAutoCommit(true); // Reset
        }
    }

    // CHECK BALANCE
    public static void checkBalance(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();

        PreparedStatement ps =
                con.prepareStatement("SELECT balance FROM account_jdbc WHERE account_id = ?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Balance: ₹" + rs.getDouble("balance"));
        } else {
            System.out.println("Account not found!");
        }
    }

    // TRANSACTION HISTORY
    public static void transactionHistory(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();

        PreparedStatement ps =
                con.prepareStatement(
                        "SELECT * FROM transaction_jdbc WHERE from_account = ? OR to_account = ?");
        ps.setInt(1, id);
        ps.setInt(2, id);

        ResultSet rs = ps.executeQuery();

        System.out.println("\n---- Transaction History ----");

        while (rs.next()) {
            System.out.println(
                    "TxnID: " + rs.getInt("transaction_id") +
                            " | From: " + rs.getInt("from_account") +
                            " | To: " + rs.getInt("to_account") +
                            " | Amount: ₹" + rs.getDouble("amount") +
                            " | Date: " + rs.getTimestamp("transaction_date")
            );
        }
    }
}
