package com.student;
import java.util.*;

public class SortingAndLimiting {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Sort students by rank (ascending)
        System.out.println("----- Students sorted by rank (ascending) -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .forEach(System.out::println);

        // 2. Sort students by age (descending)
        System.out.println("\n----- Students sorted by age (descending) -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge).reversed())
                .forEach(System.out::println);

        // 3. Print top 5 students based on rank
        System.out.println("\n----- Top 5 students by rank -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .limit(5)
                .forEach(System.out::println);

        // 4. Print last 3 students based on rank
        System.out.println("\n----- Last 3 students by rank -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 5. Students sorted by name and then rank
        System.out.println("\n----- Students sorted by name then rank -----");
        students.stream()
                .sorted(Comparator.comparing(Student::getName)
                        .thenComparingInt(Student::getRank))
                .forEach(System.out::println);
    }
}
