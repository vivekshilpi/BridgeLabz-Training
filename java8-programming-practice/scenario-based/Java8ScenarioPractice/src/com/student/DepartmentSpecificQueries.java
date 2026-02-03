package com.student;
import java.util.*;
import java.util.stream.*;

public class DepartmentSpecificQueries {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. List students department-wise with names only
        System.out.println("----- Students department-wise (names only) -----");
        Map<String, List<String>> deptNames = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));
        System.out.println(deptNames);

        // 2. Find the youngest student in Computer Engineering
        System.out.println("\n----- Youngest student in Computer Engineering -----");
        students.stream()
                .filter(s -> s.getDepartment().equalsIgnoreCase("Computer"))
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);

        // 3. Find the top-ranked student in Mechanical Engineering
        System.out.println("\n----- Top-ranked student in Mechanical Engineering -----");
        students.stream()
                .filter(s -> s.getDepartment().equalsIgnoreCase("Mechanical"))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        // 4. Count students in Electronics Engineering from Karnataka
        System.out.println("\n----- Count of Electronics students from Karnataka -----");
        long count = students.stream()
                .filter(s -> s.getDepartment().equalsIgnoreCase("Electronics"))
                .filter(s -> s.getCity().equalsIgnoreCase("Karnataka"))
                .count();
        System.out.println(count);
    }
}
