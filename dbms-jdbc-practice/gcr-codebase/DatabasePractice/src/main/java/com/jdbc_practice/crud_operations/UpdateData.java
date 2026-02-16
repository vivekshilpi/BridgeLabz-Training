package com.jdbc_practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc_practice.connection.DatabaseConnection;

public class UpdateData {
	
	public static void updateMarks(int id, int marks) {
		String sql ="UPDATE students_jdbc SET marks = ? WHERE id =?";
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, marks);
			pstmt.setInt(2, id);
			
			int rowsAffected = pstmt.executeUpdate();
			
			if(rowsAffected > 0) {
				System.out.println("marks updated for id:" + id);
			}
			else {
				System.out.println("id not found");
			}
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	public static void updateStudentInfo(int id, String name, String email, int marks) {
		String sql = "UPDATE students_jdbc SET name = ?, email=?, marks=? WHERE id=?";
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2, email);
			pstmt.setInt(3, marks);
			pstmt.setInt(4, id);
			
            int rowsAffected = pstmt.executeUpdate();
			
			if(rowsAffected > 0) {
				System.out.println("Details updated for id:" + id);
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
	
		updateMarks(10, 66);
		
		updateStudentInfo(11,"Ranu", "ranu123@gmail.com", 33);
	}

}