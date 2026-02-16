package com.jdbc_practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc_practice.connection.DatabaseConnection;

public class ReadData {
	
	public static void getAllStudent() {
		String sql = "SELECT * FROM students_jdbc";
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			
			System.out.println("ID\tName\t\tEmail\t\t\tMarks");
			System.out.println("----------------------------------------------------------");
			
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String email = result.getString("email");
				int marks = result.getInt("marks");
				
				System.out.printf("%d\t%s\t\t%s\t\t%d\n", id,name,email,marks);
			}
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
		
	}
	
	public static void getStudentById(int studentId) {
		String sql = "SELECT * FROM students_jdbc WHERE id = ?";
		
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, studentId);
			ResultSet result = stmt.executeQuery();
			
			if(result.next()) {
				System.out.println("ID\tName\t\tEmail\t\t\tMarks");
				System.out.println("--------------------------------------------------------");
				int id = result.getInt("id");
				String name = result.getString("name");
				String email = result.getString("email");
				int marks = result.getInt("marks");
				
				System.out.printf("%d\t%s\t\t%s\t\t%d\n", id,name,email,marks);
			}
			else {
				System.out.println("Student not found!");
			}
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ReadData.getAllStudent();
		System.out.println("\n");
		getStudentById(5);
	}
	

}