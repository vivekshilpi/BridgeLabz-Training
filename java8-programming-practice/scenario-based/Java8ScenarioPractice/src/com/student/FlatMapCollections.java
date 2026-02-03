package com.student;
import java.util.List;

public class FlatMapCollections {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Print all contact numbers
        System.out.println("----- All contact numbers -----");
        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .forEach(System.out::println);

        // 2. Count total number of contact numbers
        System.out.println("\n----- Total contact numbers -----");
        long totalContacts = students.stream()
                .flatMap(s -> s.getContacts().stream())
                .count();
        System.out.println(totalContacts);

        // 3. Students who have more than one contact number
        System.out.println("\n----- Students with multiple contacts -----");
        students.stream()
                .filter(s -> s.getContacts().size() > 1)
                .forEach(System.out::println);

        // 4. Unique contact numbers
        System.out.println("\n----- Unique contact numbers -----");
        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .distinct()
                .forEach(System.out::println);
    }
}
