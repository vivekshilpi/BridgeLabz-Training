package com.csv.question14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

class Student {
    public int id;
    public String name;
    public int age;
}

public class JSONCSVConverter {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = mapper.readValue(
        	    new File("students.json"),
        	    new TypeReference<List<Student>>() {}
        	);


        // JSON -> CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"))) {
            bw.write("ID,Name,Age\n");
            for (Student s : students) {
                bw.write(s.id + "," + s.name + "," + s.age + "\n");
            }
        }

        // CSV -> JSON
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            br.readLine(); // skip header
            List<Student> newList = new java.util.ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Student s = new Student();
                s.id = Integer.parseInt(parts[0]);
                s.name = parts[1];
                s.age = Integer.parseInt(parts[2]);
                newList.add(s);
            }
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("students_out.json"), newList);
        }
    }
}
