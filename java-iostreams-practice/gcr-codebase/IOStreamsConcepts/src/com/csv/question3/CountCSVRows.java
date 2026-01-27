package com.csv.question3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) throws IOException {
        String file = "src/com/csv/question3/students.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header
            while (br.readLine() != null) {
                count++;
            }
        }
        System.out.println("Number of records: " + count);
    }
}
