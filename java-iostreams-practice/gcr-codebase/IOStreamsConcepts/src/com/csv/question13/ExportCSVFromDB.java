package com.csv.question13;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;

public class ExportCSVFromDB {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Akash@123";
        String csvFile = "employees.csv";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            bw.write("Employee ID,Name,Department,Salary\n");
            while (rs.next()) {
                bw.write(rs.getInt("id") + "," + rs.getString("name") + "," +
                        rs.getString("department") + "," + rs.getDouble("salary") + "\n");
            }
        }

        rs.close();
        stmt.close();
        conn.close();
        System.out.println("CSV exported successfully!");
    }
}
