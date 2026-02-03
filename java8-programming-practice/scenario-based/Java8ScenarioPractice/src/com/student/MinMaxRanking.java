package com.student;
import java.util.Comparator;
import java.util.List;

public class MinMaxRanking {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Student with best (lowest) rank
        System.out.println("----- Student with best rank -----");
        students.stream()
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        // 2. Student with worst (highest) rank
        System.out.println("\n----- Student with worst rank -----");
        students.stream()
                .max(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        // 3. Second best rank holder
        System.out.println("\n----- Second best rank holder -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // 4. Third best rank holder
        System.out.println("\n----- Third best rank holder -----");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Youngest student
        System.out.println("\n----- Youngest student -----");
        students.stream()
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);

        // 6. Oldest student
        System.out.println("\n----- Oldest student -----");
        students.stream()
                .max(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);
    }
}
