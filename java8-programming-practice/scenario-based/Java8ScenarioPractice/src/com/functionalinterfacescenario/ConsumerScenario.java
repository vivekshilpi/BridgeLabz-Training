package com.functionalinterfacescenario;
import java.util.function.Consumer;

public class ConsumerScenario {

    static class Student {
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        Student s = new Student("Rashi", 85);

        // 1. Print student details
        System.out.println("----- Student Details -----");
        Consumer<Student> printStudent = stu -> System.out.println(stu.name + " Marks:" + stu.marks);
        printStudent.accept(s);

        // 2. Log employee login
        System.out.println("\n----- Employee Login Log -----");
        Consumer<String> logLogin = empName -> System.out.println(empName + " logged in at " + java.time.LocalTime.now());
        logLogin.accept("Sahil");

        // 3. Print order confirmation
        System.out.println("\n----- Order Confirmation -----");
        Consumer<Integer> orderConfirm = orderId -> System.out.println("Order #" + orderId + " confirmed!");
        orderConfirm.accept(101);

        // 4. Display account balance
        System.out.println("\n----- Account Balance -----");
        Consumer<Double> showBalance = balance -> System.out.println("Balance: " + balance);
        showBalance.accept(1500.0);

        // 5. Send notification message
        System.out.println("\n----- Notification -----");
        Consumer<String> sendNotification = msg -> System.out.println("Notification: " + msg);
        sendNotification.accept("Your order has been shipped!");
    }
}
