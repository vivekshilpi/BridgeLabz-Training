package medistore;

import java.time.LocalDate;

public abstract class Medicine {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int stock;

    // Constructor with default stock
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Constructor with custom stock
    public Medicine(String name, double price, LocalDate expiryDate, int stock) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.stock = stock;
    }

    // Encapsulated stock reduction
    protected void reduceStock(int qty) {
        if (qty > stock) {
            throw new IllegalArgumentException("Insufficient stock");
        }
        stock -= qty;
    }

    protected int getStock() {
        return stock;
    }

    protected double getPrice() {
        return price;
    }

    protected LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getName() {
        return name;
    }

    // Pricing must be defined by subclasses
    public abstract double totalPrice(int quantity);
}
