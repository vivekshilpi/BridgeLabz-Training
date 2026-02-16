package com.jdbc_practice.connection;


import java.sql.*;

public class ConnectionWithParameters {
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/blabz_db";
		// Connection properties
		java.util.Properties properties = new java.util.Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "MySql@123");
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrieval", "true");
		return DriverManager.getConnection(url, properties);
		}
	
	public static void main(String[] args) {
	    try {
	        Connection con = getConnection();
	        
	        if (con != null) {
	            System.out.println("Connection Successful ");
	            System.out.println("Database: " + con.getCatalog());
	        }
	        
	        con.close();
	        
	    } catch (SQLException e) {
	        System.out.println("Connection Failed ");
	        e.printStackTrace();
	    }
	}


}