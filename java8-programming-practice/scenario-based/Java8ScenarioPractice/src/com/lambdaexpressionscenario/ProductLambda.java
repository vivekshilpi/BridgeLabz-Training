package com.lambdaexpressionscenario;
import java.util.*;

public class ProductLambda {

    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " Price:" + price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 50000),
                new Product("Mouse", 400),
                new Product("Keyboard", 700)
        );

        // 1. Apply 10% discount
        System.out.println("----- Price after 10% discount -----");
        products.forEach(p -> System.out.println(p.name + ": " + p.price * 0.9));

        // 2. Sort products by price
        System.out.println("\n----- Products sorted by price -----");
        products.stream()
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(System.out::println);

        // 3. Free delivery eligibility (price > 500)
        System.out.println("\n----- Free Delivery Eligibility -----");
        products.forEach(p -> System.out.println(p.name + ": " + (p.price > 500 ? "Eligible" : "Not Eligible")));

        // 4. Calculate final bill amount
        System.out.println("\n----- Final Bill Amount -----");
        double totalBill = products.stream()
                .mapToDouble(p -> p.price)
                .sum();
        System.out.println(totalBill);

        // 5. Print product names
        System.out.println("\n----- Product Names -----");
        products.stream()
                .map(p -> p.name)
                .forEach(System.out::println);
    }
}
