package com.csv.question6;
import java.io.*;
import java.util.*;

public class UpdateSalary {
    public static void main(String[] args) throws IOException {
        String inputFile = "src/com/csv/question6/employees.csv";
        String outputFile = "employees_updated.csv";
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String header = br.readLine();
            records.add(header.split(","));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]);
                    data[3] = String.valueOf(salary * 1.1); // Increase by 10%
                }
                records.add(data);
            }
        }

        try (FileWriter fw = new FileWriter(outputFile)) {
            for (String[] rec : records) {
                fw.write(String.join(",", rec) + "\n");
            }
        }
        System.out.println("Updated CSV created: " + outputFile);
    }
}
