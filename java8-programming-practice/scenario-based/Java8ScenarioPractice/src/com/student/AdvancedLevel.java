package com.student;
import java.util.*;
import java.util.stream.*;

public class AdvancedLevel {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Convert student list into Map<Id, Name>
        System.out.println("----- Map<Id, Name> -----");
        Map<Integer, String> idNameMap = students.stream()
                .collect(Collectors.toMap(Student::getId, Student::getName));
        System.out.println(idNameMap);

        // 2. Convert student list into Map<Department, List<Student>>
        System.out.println("\n----- Map<Department, List<Student>> -----");
        Map<String, List<Student>> deptMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println(deptMap);

        // 3. Find students whose name starts with 'S'
        System.out.println("\n----- Students whose name starts with 'S' -----");
        students.stream()
                .filter(s -> s.getName().startsWith("S"))
                .forEach(System.out::println);

        // 4. Find students whose name length > 5
        System.out.println("\n----- Students whose name length > 5 -----");
        students.stream()
                .filter(s -> s.getName().length() > 5)
                .forEach(System.out::println);

        // 5. Find students whose rank is even
        System.out.println("\n----- Students with even rank -----");
        students.stream()
                .filter(s -> s.getRank() % 2 == 0)
                .forEach(System.out::println);

        // 6. Find students whose rank is odd
        System.out.println("\n----- Students with odd rank -----");
        students.stream()
                .filter(s -> s.getRank() % 2 != 0)
                .forEach(System.out::println);
    }
}
