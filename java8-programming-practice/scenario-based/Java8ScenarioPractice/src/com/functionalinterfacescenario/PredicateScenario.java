package com.functionalinterfacescenario;
import java.util.function.Predicate;

public class PredicateScenario {

    static class Student {
        String name;
        double attendance;

        public Student(String name, double attendance) {
            this.name = name;
            this.attendance = attendance;
        }
    }

    static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static class BankAccount {
        String name;
        double balance;

        public BankAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {

        Student s = new Student("Rashi", 80);
        Employee e = new Employee("Sahil", 35000);
        BankAccount acc = new BankAccount("Ankit", 1000);
        double orderAmount = 600;
        int number = 7;

        // 1. Check if student is eligible for exam (attendance >= 75%)
        System.out.println("----- Student Eligibility -----");
        Predicate<Student> isEligible = stu -> stu.attendance >= 75;
        System.out.println(s.name + ": " + isEligible.test(s));

        // 2. Check if salary > 30000
        System.out.println("\n----- Salary Check -----");
        Predicate<Employee> highSalary = emp -> emp.salary > 30000;
        System.out.println(e.name + ": " + highSalary.test(e));

        // 3. Validate withdrawal amount (< balance)
        System.out.println("\n----- Withdrawal Validation -----");
        Predicate<Double> validWithdrawal = amt -> amt <= acc.balance;
        System.out.println("Withdraw 500: " + validWithdrawal.test(500.0));
        System.out.println("Withdraw 1500: " + validWithdrawal.test(1500.0));

        // 4. Free delivery eligibility (amount > 500)
        System.out.println("\n----- Free Delivery Eligibility -----");
        Predicate<Double> freeDelivery = amt -> amt > 500;
        System.out.println(orderAmount + ": " + freeDelivery.test(orderAmount));

        // 5. Check if number is even
        System.out.println("\n----- Even/Odd Check -----");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(number + " is even? " + isEven.test(number));
    }
}
