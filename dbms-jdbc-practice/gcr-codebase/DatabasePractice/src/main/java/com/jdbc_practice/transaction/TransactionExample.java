package com.jdbc_practice.transaction;

import java.sql.*;

import com.jdbc_practice.connection.DatabaseConnection;

public class TransactionExample {
	
	public static void transferMoney(int fromAccount, int toAccount, double amount) {
		Connection connection = null;
		
		try {
		    connection = DatabaseConnection.getConnection();
			connection.setAutoCommit(false);
			
			String debitQuery = "UPDATE accounts_jdbc SET balance = balance - ? WHERE account_id = ?";
			PreparedStatement debitStmt = connection.prepareStatement(debitQuery);
			debitStmt.setDouble(1, amount);
			debitStmt.setInt(2, fromAccount);
			int debitRes = debitStmt.executeUpdate();
			
			String creditQuery = "UPDATE accounts_jdbc SET balance = balance + ? WHERE account_id = ?";
			PreparedStatement creditStmt = connection.prepareStatement(creditQuery);
			creditStmt.setDouble(1, amount);
			creditStmt.setInt(2, toAccount);
			int creditRes = creditStmt.executeUpdate();
			
			// Check if both operations succeeded
			if (debitRes > 0 && creditRes > 0) {
			connection.commit(); // Commit transaction
			System.out.println("Transfer successful!");
			} else {
			connection.rollback(); // Rollback on failure
			System.out.println("Transfer failed - rolled back!");
			}
		}
		catch(SQLException e) {
			try {
				if (connection != null) {
				connection.rollback(); // Rollback on exception
				System.out.println("Transaction rolled back due to error!");
				}
				}
			catch (SQLException ex) {
				ex.printStackTrace();
				}
		}
		finally {
			try {
				if(connection != null) {
				connection.setAutoCommit(true);
				connection.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) {
		transferMoney(102, 101, 500);
	}

}