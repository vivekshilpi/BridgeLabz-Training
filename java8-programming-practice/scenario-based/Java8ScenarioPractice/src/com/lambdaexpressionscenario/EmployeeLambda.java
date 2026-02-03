package com.lambdaexpressionscenario;
import java.util.*;

public class EmployeeLambda {

    static class Employee {
        String name;
        double salary;
        int experience;

        public Employee(String name, double salary, int experience) {
            this.name = name;
            this.salary = salary;
            this.experience = experience;
        }

        @Override
        public String toString() {
            return name + " Salary:" + salary + " Exp:" + experience;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 40000, 4),
                new Employee("Bob", 25000, 2),
                new Employee("Charlie", 35000, 5)
        );

        // 1. Calculate bonus (10% if salary > 30000)
        System.out.println("----- Employee Bonus -----");
        employees.forEach(e -> System.out.println(e.name + ": " + (e.salary > 30000 ? e.salary * 0.10 : 0)));

        // 2. Sort employees by salary
        System.out.println("\n----- Employees sorted by salary -----");
        employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .forEach(System.out::println);

        // 3. Promotion eligibility (exp > 3 years)
        System.out.println("\n----- Promotion Eligibility -----");
        employees.forEach(e -> System.out.println(e.name + ": " + (e.experience > 3 ? "Eligible" : "Not Eligible")));

        // 4. Print employee details
        System.out.println("\n----- Employee Details -----");
        employees.forEach(System.out::println);

        // 5. Compare two employees' salaries
        System.out.println("\n----- Compare Salaries -----");
        Employee e1 = employees.get(0);
        Employee e2 = employees.get(1);
        Comparator<Employee> salaryComp = (emp1, emp2) -> Double.compare(emp1.salary, emp2.salary);
        System.out.println("Comparison: " + salaryComp.compare(e1, e2));
    }
}
