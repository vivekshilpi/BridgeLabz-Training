package com.functionalinterfacescenario;
import java.util.function.Function;

public class FunctionScenario {

    public static void main(String[] args) {

        // 1. Convert student marks into grade
        System.out.println("----- Marks to Grade -----");
        Function<Integer, String> gradeFunc = marks -> {
            if (marks >= 80) return "A";
            else if (marks >= 60) return "B";
            else return "C";
        };
        System.out.println("Marks 85: " + gradeFunc.apply(85));

        // 2. Monthly salary to annual salary
        System.out.println("\n----- Annual Salary -----");
        Function<Double, Double> annualSalary = monthly -> monthly * 12;
        System.out.println("Monthly 3000: " + annualSalary.apply(3000.0));

        // 3. Product price to discounted price
        System.out.println("\n----- Discounted Price -----");
        Function<Double, Double> discount = price -> price * 0.9; // 10% off
        System.out.println("Price 500: " + discount.apply(500.0));

        // 4. Employee name to uppercase
        System.out.println("\n----- Uppercase Name -----");
        Function<String, String> toUpper = name -> name.toUpperCase();
        System.out.println(toUpper.apply("sahil"));

        // 5. Celsius to Fahrenheit
        System.out.println("\n----- Celsius to Fahrenheit -----");
        Function<Double, Double> cToF = c -> (c * 9/5) + 32;
        System.out.println("30°C = " + cToF.apply(30.0) + "°F");
    }
}
