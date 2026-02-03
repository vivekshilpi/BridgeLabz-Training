package com.functionalinterfacescenario;
import java.util.*;

public class ComparatorScenario {

    static class Student {
        String name;
        int rank;
        public Student(String name, int rank) { this.name = name; this.rank = rank; }
        public String toString() { return name + " Rank:" + rank; }
    }

    static class Employee {
        String name;
        double salary;
        public Employee(String name, double salary) { this.name = name; this.salary = salary; }
        public String toString() { return name + " Salary:" + salary; }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Rashi", 1), new Student("Sahil", 3));
        List<Employee> employees = Arrays.asList(new Employee("Alice", 40000), new Employee("Bob", 35000));

        // 1. Compare two students by rank
        System.out.println("----- Compare Students by Rank -----");
        Comparator<Student> studentRankComp = (s1, s2) -> Integer.compare(s1.rank, s2.rank);
        System.out.println(studentRankComp.compare(students.get(0), students.get(1)));

        // 2. Compare two employees by salary
        System.out.println("\n----- Compare Employees by Salary -----");
        Comparator<Employee> empSalaryComp = (e1,e2) -> Double.compare(e1.salary, e2.salary);
        System.out.println(empSalaryComp.compare(employees.get(0), employees.get(1)));

        // 3. Compare two strings by length
        System.out.println("\n----- Compare Strings by Length -----");
        Comparator<String> stringLengthComp = (a,b) -> Integer.compare(a.length(), b.length());
        System.out.println(stringLengthComp.compare("Hello", "World!"));

        // 4. Compare two integers
        System.out.println("\n----- Compare Integers -----");
        Comparator<Integer> intComp = (a,b) -> a-b;
        System.out.println(intComp.compare(5,10));
    }
}
