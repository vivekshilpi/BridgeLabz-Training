package com.objectmodelling.selfProblems;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String productName;
    private double price;

    // constructor to initialize product
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // method to display product details
    public void displayProduct() {
        System.out.println("Product name - " + productName +
                "\n product price- " + price);
    }
}
class Order {
    private int orderId;
    private List<Product> productList;

    // constructor to initialize order
    public Order(int orderId) {
        this.orderId = orderId;
        productList = new ArrayList<>();
    }

    // method to add product in order
    public void addProduct(Product product) {
        productList.add(product);
    }

    // method to display order
    public void displayOrder() {
        System.out.println("\nOrder id - " + orderId +
                "\nAll products - ");
        for (Product product : productList) {
            product.displayProduct();
        }

    }
}
class Customer {
    private String customerName;
    private Order order;

    // constructor to initialize customer object
    public Customer(String customerName, Order order) {
        this.customerName = customerName;
        this.order = order;
    }

    // method to display customer details
    public void displayCustomer() {
        System.out.println("\nCustomer name - " + customerName);
        order.displayOrder();
    }
}

public class ECommercePlatform{
    public static void main(String[] args) {
        // create object of product class
        Product product1 = new Product("Laptop", 55000);
        Product product2 = new Product("Earbuds", 6000);

        // create order object
        Order order = new Order(106);
        // add product to order
        order.addProduct(product1);
        order.addProduct(product2);

        // create object of customer
        Customer customer = new Customer("om", order);
        // display customer details
        customer.displayCustomer();
    }
}