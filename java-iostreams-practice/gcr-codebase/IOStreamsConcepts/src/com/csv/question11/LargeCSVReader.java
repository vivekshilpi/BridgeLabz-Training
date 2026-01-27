package com.csv.question11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeCSVReader {
    public static void main(String[] args) throws IOException {
        String file = "src/com/csv/question1/students.csv";
        int batchSize = 100;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // skip header
            String line;
            int batchCount = 0;
            while ((line = br.readLine()) != null) {
                batchCount++;
                count++;
                if (batchCount == batchSize) {
                    System.out.println("Processed " + count + " records");
                    batchCount = 0;
                }
            }
            System.out.println("Total records processed: " + count);
        }
    }
}
