package com.csv.question10;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSV {
    public static void main(String[] args) throws IOException {
        String file1 = "src/com/csv/question10/students1.csv";
        String file2 = "src/com/csv/question10/students2.csv";
        String mergedFile = "merged.csv";

        Map<String, String> map1 = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String header = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                map1.put(parts[0], parts[1] + "," + parts[2]); // ID -> Name,Age
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {

            String header = br.readLine();
            bw.write("ID,Name,Age,Marks,Grade\n");

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String nameAge = map1.get(id);
                if (nameAge != null) {
                    bw.write(id + "," + nameAge + "," + parts[1] + "," + parts[2] + "\n");
                }
            }
        }
        System.out.println("CSV files merged successfully!");
    }
}
