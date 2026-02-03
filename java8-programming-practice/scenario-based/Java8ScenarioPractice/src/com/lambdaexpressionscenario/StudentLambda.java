package com.lambdaexpressionscenario;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentLambda {

    static class Student {
        String name;
        int marks;
        int rank;
        int age;

        public Student(String name, int marks, int rank, int age) {
            this.name = name;
            this.marks = marks;
            this.rank = rank;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " Marks:" + marks + " Rank:" + rank + " Age:" + age;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Rashi", 85, 1, 21),
                new Student("Sahil", 45, 3, 19),
                new Student("Ankit", 60, 2, 22),
                new Student("Sneha", 30, 4, 18)
        );

        // 1. Welcome message
        System.out.println("----- Welcome Message -----");
        Runnable welcome = () -> System.out.println("Welcome to the School System!");
        welcome.run();

        // 2. Check pass/fail (pass >= 40)
        System.out.println("\n----- Pass/Fail Status -----");
        students.forEach(s -> System.out.println(s.name + ": " + (s.marks >= 40 ? "Pass" : "Fail")));

        // 3. Sort students by name
        System.out.println("\n----- Students sorted by name -----");
        students.stream()
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        // 4. Sort students by rank
        System.out.println("\n----- Students sorted by rank -----");
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.rank))
                .forEach(System.out::println);

        // 5. Students whose age is above 18
        System.out.println("\n----- Students with age > 18 -----");
        students.stream()
                .filter(s -> s.age > 18)
                .forEach(System.out::println);
    }
}
