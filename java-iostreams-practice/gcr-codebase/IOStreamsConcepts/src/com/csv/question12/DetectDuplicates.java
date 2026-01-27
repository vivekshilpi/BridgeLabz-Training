package com.csv.question12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicates {
    public static void main(String[] args) throws IOException {
        String file = "src/com/csv/question12/students.csv";
        Set<String> ids = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // skip header
            String line;
            while ((line = br.readLine()) != null) {
                String id = line.split(",")[0];
                if (!ids.add(id)) {
                    duplicates.add(line);
                }
            }
        }

        duplicates.forEach(System.out::println);
    }
}
