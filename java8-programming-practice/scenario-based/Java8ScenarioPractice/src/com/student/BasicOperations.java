package com.student;

import java.util.List;

public class BasicOperations {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Print all students whose rank is less than 50
        System.out.println("----- Students with rank < 50 -----");
        students.stream()
                .filter(s -> s.getRank() < 50)
                .forEach(System.out::println);

        // 2. Print all students whose age is greater than 25
        System.out.println("\n----- Students with age > 25 -----");
        students.stream()
                .filter(s -> s.getAge() > 25)
                .forEach(System.out::println);

        // 3. Print the names of all students only
        System.out.println("\n----- Names of all students -----");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        // 4. Print all students belonging to Mechanical Engineering
        System.out.println("\n----- Students in Mechanical -----");
        students.stream()
                .filter(s -> s.getDepartment().equalsIgnoreCase("Mechanical"))
                .forEach(System.out::println);

        // 5. Print all students not from Mumbai
        System.out.println("\n----- Students not from Mumbai -----");
        students.stream()
                .filter(s -> !s.getCity().equalsIgnoreCase("Mumbai"))
                .forEach(System.out::println);
    }
}
