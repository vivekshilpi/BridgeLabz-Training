package collections.examples.shoppingcart;

import java.util.*;

public class ShoppingCart {

    // Stores all available products and their prices
    private HashMap<String, Double> productPriceMap = new HashMap<>();

    // Stores items added to cart in insertion order
    private LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

    private Scanner sc = new Scanner(System.in);

    public void addProductToStore() {
        System.out.print("Enter Product Name: ");
        String product = sc.next();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        productPriceMap.put(product, price);
        System.out.println("Product added to store successfully!\n");
    }

    public void addToCart() {
        System.out.print("Enter Product Name to Add to Cart: ");
        String product = sc.next();

        if (productPriceMap.containsKey(product)) {
            cart.put(product, productPriceMap.get(product));
            System.out.println("Item added to cart.\n");
        } else {
            System.out.println("Product not available in store!\n");
        }
    }

    public void removeFromCart() {
        System.out.print("Enter Product Name to Remove: ");
        String product = sc.next();

        if (cart.containsKey(product)) {
            cart.remove(product);
            System.out.println("Item removed from cart.\n");
        } else {
            System.out.println("Item not found in cart!\n");
        }
    }

    public void displayCartInOrder() {
        System.out.println("\n--- Shopping Cart (Insertion Order - LinkedHashMap) ---");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: ₹" + entry.getValue());
        }
        System.out.println();
    }

    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\n--- Cart Items Sorted by Price (TreeMap) ---");
        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) {
            System.out.println("Price: ₹" + entry.getKey() + " | Product: " + entry.getValue());
        }
        System.out.println();
    }

    public void menu() {
        int choice;

        do {
            System.out.println("===== Shopping Cart Menu =====");
            System.out.println("1. Add Product to Store");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. Display Cart (Insertion Order)");
            System.out.println("5. Display Cart Sorted by Price");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProductToStore();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    removeFromCart();
                    break;
                case 4:
                    displayCartInOrder();
                    break;
                case 5:
                    displaySortedByPrice();
                    break;
                case 6:
                    System.out.println("Thank you for using the Shopping Cart System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        } while (choice != 6);
    }

    public static void main(String[] args) {
        ShoppingCart cartSystem = new ShoppingCart();
        cartSystem.menu();
    }
}
