package com.optionalclassscenario;
import java.util.*;

public class OptionalECommerce {

    static class Product {
        String name;
        Double discount;
        String couponCode;
        String seller;
        String description;
        String deliveryPartner;

        public Product(String name, Double discount, String couponCode, String seller, String description, String deliveryPartner) {
            this.name = name;
            this.discount = discount;
            this.couponCode = couponCode;
            this.seller = seller;
            this.description = description;
            this.deliveryPartner = deliveryPartner;
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", null, null, null, null, null);
        Product p2 = new Product("Phone", 10.0, "SAVE10", "Amazon", "Smartphone", "DHL");

        // 1. Apply default discount if missing
        System.out.println("----- Discount -----");
        System.out.println(Optional.ofNullable(p1.discount).orElse(0.0));
        System.out.println(Optional.ofNullable(p2.discount).orElse(0.0));

        // 2. Fetch coupon code if present
        System.out.println("\n----- Coupon Code -----");
        Optional.ofNullable(p1.couponCode).ifPresentOrElse(System.out::println, () -> System.out.println("No Coupon"));
        Optional.ofNullable(p2.couponCode).ifPresentOrElse(System.out::println, () -> System.out.println("No Coupon"));

        // 3. Display seller details safely
        System.out.println("\n----- Seller -----");
        System.out.println(Optional.ofNullable(p1.seller).orElse("No Seller"));
        System.out.println(Optional.ofNullable(p2.seller).orElse("No Seller"));

        // 4. Product description
        System.out.println("\n----- Description -----");
        System.out.println(Optional.ofNullable(p1.description).orElse("No description available"));
        System.out.println(Optional.ofNullable(p2.description).orElse("No description available"));

        // 5. Delivery partner info
        System.out.println("\n----- Delivery Partner -----");
        System.out.println(Optional.ofNullable(p1.deliveryPartner).orElse("No Delivery Partner"));
        System.out.println(Optional.ofNullable(p2.deliveryPartner).orElse("No Delivery Partner"));
    }
}
