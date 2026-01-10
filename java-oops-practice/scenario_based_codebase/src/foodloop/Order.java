package foodloop;

import java.util.*;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double subtotal;
    private double total;
    private double discount;

    // Constructor for combo meals
    public Order(List<FoodItem> items) {
        this.items = items;
        calculateTotal();
    }

    private void calculateTotal() {
        subtotal = 0;

        for (FoodItem item : items) {
            subtotal += item.getPrice();   // correct sum
        }

        discount = applyDiscount(subtotal);
        total = subtotal - discount;
    }

    // Polymorphism-ready discount logic
    protected double applyDiscount(double amount) {

        if (amount >= 1000) {
            return 200;
        } else if (amount >= 500) {
            return 100;
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        System.out.println("\nOrder placed successfully!");
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled. Refund initiated.");
    }
}