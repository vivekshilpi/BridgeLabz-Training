package com.csv.question2;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String file = "C:\\Users\\rashi\\Desktop\\Java Workspace\\java-iostream-practice\\gcr-codebase\\JavaIOstreamPractice\\src\\main\\java\\question1\\employees.csv";
        String data = "ID,Name,Department,Salary\n" +
                      "101,John,IT,50000\n" +
                      "102,Alice,HR,45000\n" +
                      "103,Bob,Finance,48000\n" +
                      "104,Emma,IT,52000\n" +
                      "105,David,Marketing,47000\n";

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(data);
            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
