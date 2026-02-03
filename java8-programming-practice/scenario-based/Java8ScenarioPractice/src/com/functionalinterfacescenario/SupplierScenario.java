package com.functionalinterfacescenario;
import java.util.function.Supplier;
import java.util.Random;
import java.time.LocalDateTime;

public class SupplierScenario {

    public static void main(String[] args) {

        Random random = new Random();

        // 1. Generate OTP
        System.out.println("----- OTP -----");
        Supplier<Integer> otpSupplier = () -> 1000 + random.nextInt(9000);
        System.out.println(otpSupplier.get());

        // 2. Generate random student ID
        System.out.println("\n----- Random Student ID -----");
        Supplier<String> studentIdSupplier = () -> "SID" + (1000 + random.nextInt(9000));
        System.out.println(studentIdSupplier.get());

        // 3. Provide current date and time
        System.out.println("\n----- Current Date & Time -----");
        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now();
        System.out.println(dateTimeSupplier.get());

        // 4. Provide default welcome message
        System.out.println("\n----- Welcome Message -----");
        Supplier<String> welcomeMsg = () -> "Welcome to the system!";
        System.out.println(welcomeMsg.get());

        // 5. Generate random discount coupon
        System.out.println("\n----- Discount Coupon -----");
        Supplier<String> couponSupplier = () -> "DISC" + (100 + random.nextInt(900));
        System.out.println(couponSupplier.get());
    }
}
