package com.student;
import java.util.List;

public class ConditionalMatching {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        // 1. Check if any student belongs to Biotech Engineering
        System.out.println("----- Any student in Biotech? -----");
        boolean anyBiotech = students.stream()
                .anyMatch(s -> s.getDepartment().equalsIgnoreCase("Biotech"));
        System.out.println(anyBiotech);

        // 2. Check if all students are above age 20
        System.out.println("\n----- All students above age 20? -----");
        boolean allAbove20 = students.stream()
                .allMatch(s -> s.getAge() > 20);
        System.out.println(allAbove20);

        // 3. Check if no student belongs to Civil Engineering
        System.out.println("\n----- No student in Civil? -----");
        boolean noneCivil = students.stream()
                .noneMatch(s -> s.getDepartment().equalsIgnoreCase("Civil"));
        System.out.println(noneCivil);
    }
}
