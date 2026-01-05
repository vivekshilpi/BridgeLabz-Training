package swift_cart;

import java.util.HashMap;

public class Cart implements ICheckout {

    private HashMap<Product, Integer> items = new HashMap<>();
    private double totalPrice;   // Encapsulated

    // Empty cart
    public Cart() {}

    // Pre-selected items cart
    public Cart(Product p, int qty) {
        addProduct(p, qty);
    }

    public void addProduct(Product p, int quantity) {
        items.put(p, items.getOrDefault(p, 0) + quantity);
        calculateTotal();
    }

    public void removeProduct(Product p) {
        items.remove(p);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : items.keySet()) {
            int qty = items.get(p);
            totalPrice += p.getPrice() * qty; // Operator usage
        }
    }

    // Polymorphic discount application
    @Override
    public void applyDiscount(double couponAmount) {
        double discount = 0;
        for (Product p : items.keySet()) {
            discount += (p.getPrice() * items.get(p)) * p.getDiscountRate();
        }
        totalPrice = totalPrice - discount - couponAmount;
    }

    @Override
    public void generateBill() {
        System.out.println("\n----- SwiftCart Bill -----");
        for (Product p : items.keySet()) {
            System.out.println(p.getName() + " x " + items.get(p));
        }
        System.out.println("Final Amount : ₹" + totalPrice);
    }
}

