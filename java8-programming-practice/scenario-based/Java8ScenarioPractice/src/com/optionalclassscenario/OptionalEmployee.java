package com.optionalclassscenario;
import java.util.*;

public class OptionalEmployee {

    static class Employee {
        String name;
        String manager;
        Double bonus;
        String email;
        String insurance;
        String middleName;

        public Employee(String name, String manager, Double bonus, String email, String insurance, String middleName) {
            this.name = name;
            this.manager = manager;
            this.bonus = bonus;
            this.email = email;
            this.insurance = insurance;
            this.middleName = middleName;
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", null, null, null, null, null);
        Employee emp2 = new Employee("Bob", "Charlie", 5000.0, "bob@email.com", "Policy123", "K");

        // 1. Fetch manager safely
        System.out.println("----- Manager Details -----");
        System.out.println(Optional.ofNullable(emp1.manager).orElse("No Manager"));
        System.out.println(Optional.ofNullable(emp2.manager).orElse("No Manager"));

        // 2. Fetch bonus or default 0
        System.out.println("\n----- Bonus Amount -----");
        System.out.println(Optional.ofNullable(emp1.bonus).orElse(0.0));
        System.out.println(Optional.ofNullable(emp2.bonus).orElse(0.0));

        // 3. Find employee by email, else throw exception
        System.out.println("\n----- Employee by Email -----");
        try {
            String email = Optional.ofNullable(emp1.email).orElseThrow(() -> new Exception("Employee not found"));
            System.out.println(email);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // 4. Fetch insurance safely
        System.out.println("\n----- Insurance Details -----");
        System.out.println(Optional.ofNullable(emp1.insurance).orElse("No Insurance"));
        System.out.println(Optional.ofNullable(emp2.insurance).orElse("No Insurance"));

        // 5. Display middle name if present
        System.out.println("\n----- Middle Name -----");
        Optional.ofNullable(emp1.middleName).ifPresentOrElse(System.out::println, () -> System.out.println("No Middle Name"));
        Optional.ofNullable(emp2.middleName).ifPresentOrElse(System.out::println, () -> System.out.println("No Middle Name"));
    }
}
