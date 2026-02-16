package com.jdbc_practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc_practice.connection.DatabaseConnection;

public class InsertData {
	
	public static void insertStudent(int id, String name, String email, int marks) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = "INSERT INTO students_jdbc(id, name, email, marks ) VALUES (?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setInt(4, marks);
			
			int rowsAffected = stmt.executeUpdate();
			
			if(rowsAffected > 0) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("Data not inserted");
			}
		}
		catch(SQLException e ) {
			e.getStackTrace();
		}
	}
	
	public static void main(String[] args) {
		insertStudent(1, "Aarav", "aarav11@gmail.com", 87);
		insertStudent(2, "Meera", "meera12@gmail.com", 91);
		insertStudent(3, "Rohan", "rohan13@gmail.com", 76);
		insertStudent(4, "Ishita", "ishita14@gmail.com", 89);
		insertStudent(5, "Kabir", "kabir15@gmail.com", 68);
		insertStudent(6, "Ananya", "ananya16@gmail.com", 94);
		insertStudent(7, "Dev", "dev17@gmail.com", 72);
		insertStudent(8, "Simran", "simran18@gmail.com", 85);
		insertStudent(9, "Arjun", "arjun19@gmail.com", 79);
		insertStudent(10, "Tanya", "tanya20@gmail.com", 90);
		insertStudent(11, "Sanya", "sm@gmail.com", 98);
	}

}