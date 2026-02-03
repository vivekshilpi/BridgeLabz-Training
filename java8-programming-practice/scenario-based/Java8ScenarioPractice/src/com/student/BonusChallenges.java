package com.student;
import java.util.*;
import java.util.stream.*;

public class BonusChallenges {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Top 3 youngest students
        System.out.println("----- Top 3 youngest students -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .limit(3)
                .forEach(System.out::println);

        // 2. Top 3 oldest students
        System.out.println("\n----- Top 3 oldest students -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 3. Partition students based on age > 25
        System.out.println("\n----- Partition students by age > 25 -----");
        Map<Boolean, List<Student>> agePartition = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getAge() > 25));
        System.out.println(agePartition);

        // 4. Partition students based on rank < 100
        System.out.println("\n----- Partition students by rank < 100 -----");
        Map<Boolean, List<Student>> rankPartition = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getRank() < 100));
        System.out.println(rankPartition);

        // 5. City having maximum students
        System.out.println("\n----- City with maximum students -----");
        students.stream()
                .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);

        // 6. Department having minimum students
        System.out.println("\n----- Department with minimum students -----");
        students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
