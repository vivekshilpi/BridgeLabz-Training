package com.student;

import java.util.*;

public class StudentData {
    public static List<Student> getStudents() {
        return Arrays.asList(
            new Student(1, "Rashi Raj", "Rashi", 21, "Female", "Mumbai", "Mechanical", 45, Arrays.asList("12345", "67890")),
            new Student(2, "Sahil Kumar", "Sahil", 26, "Male", "Delhi", "Computer", 12, Arrays.asList("11111")),
            new Student(3, "Ankit Sharma", "Ankit", 27, "Male", "Bangalore", "Mechanical", 55, Arrays.asList("22222", "33333")),
            new Student(4, "Sneha Singh", "Sneha", 24, "Female", "Mumbai", "Electronics", 34, Arrays.asList("44444")),
            new Student(5, "Shivani Patel", "Shivani", 28, "Female", "Kolkata", "Mechanical", 23, Arrays.asList("55555")),
            new Student(6, "Saurabh Mehta", "Saurabh", 22, "Male", "Chennai", "Computer", 78, Arrays.asList("66666", "77777")),
            new Student(7, "Sonia Roy", "Sonia", 25, "Female", "Delhi", "Biotech", 67, Arrays.asList("88888")),
            new Student(8, "Rohit Jain", "Rohit", 29, "Male", "Mumbai", "Electronics", 18, Arrays.asList("99999"))
        );
    }
}
