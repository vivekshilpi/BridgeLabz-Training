package com.lambdaexpressionscenario;
import java.util.*;
import java.util.function.BinaryOperator;

public class SystemTasksLambda {

    public static void main(String[] args) {

        // 1. Run a task in a separate thread
        System.out.println("----- Thread Task -----");
        Runnable task = () -> System.out.println("Task running in separate thread!");
        new Thread(task).start();

        // 2. Print numbers from a list
        System.out.println("\n----- Print Numbers -----");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(n -> System.out.println(n));

        // 3. Check if a number is even or odd
        System.out.println("\n----- Even or Odd -----");
        numbers.forEach(n -> System.out.println(n + ": " + (n % 2 == 0 ? "Even" : "Odd")));

        // 4. Add two numbers
        System.out.println("\n----- Add Two Numbers -----");
        BinaryOperator<Integer> add = (a,b) -> a+b;
        System.out.println("5 + 10 = " + add.apply(5,10));

        // 5. Find greater of two numbers
        System.out.println("\n----- Greater of Two Numbers -----");
        BinaryOperator<Integer> max = (a,b) -> a>b ? a : b;
        System.out.println("Greater(7,12) = " + max.apply(7,12));
    }
}
