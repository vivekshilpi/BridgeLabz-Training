package com.csv.question8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {
    public static void main(String[] args) {
        String file = "src/com/csv/question8/students.csv";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern emailPattern = Pattern.compile(emailRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String email = parts[2].trim();
                String phone = parts[3].trim();

                boolean validEmail = emailPattern.matcher(email).matches();
                boolean validPhone = phone.matches("\\d{10}");

                if (!validEmail || !validPhone) {
                    System.out.println("Invalid row: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
