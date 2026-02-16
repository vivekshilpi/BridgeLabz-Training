package com.jdbc_practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc_practice.connection.DatabaseConnection;

public class DeleteData {
	
	public static void delete(int id) {
		String sql = "DELETE FROM students_jdbc WHERE id = ?";
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			int rowAffected = pstmt.executeUpdate();
			
			if(rowAffected > 0) {
				System.out.println("Data deleted of id : " + id);
			}
			else {
				System.out.println("id not found");
			}
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	public static void main(String[] args) {
		delete(11);
		delete(12);
	}

}