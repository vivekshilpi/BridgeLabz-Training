package com.student;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderBasedAnalysis {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Count male and female students
        System.out.println("----- Count by gender -----");
        Map<String, Long> genderCount = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(genderCount);

        // 2. Average age of male students
        System.out.println("\n----- Average age of male students -----");
        students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.averagingInt(Student::getAge));
        double avgMaleAge = students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.averagingInt(Student::getAge));
        System.out.println(avgMaleAge);

        // 3. Average age of female students
        System.out.println("\n----- Average age of female students -----");
        double avgFemaleAge = students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.averagingInt(Student::getAge));
        System.out.println(avgFemaleAge);

        // 4. Highest ranked male student
        System.out.println("\n----- Highest ranked male student -----");
        students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        // 5. Highest ranked female student
        System.out.println("\n----- Highest ranked female student -----");
        students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);
    }
}
