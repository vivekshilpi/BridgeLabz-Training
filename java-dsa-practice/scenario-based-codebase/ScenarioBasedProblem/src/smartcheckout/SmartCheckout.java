package smartcheckout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SmartCheckout {

    public Queue<Customer> customerQueue;
    public HashMap<String, Item> itemMap;

    public SmartCheckout() {
        this.customerQueue = new LinkedList<>();
        this.itemMap = new HashMap<>();
    }

    // Add item to store
    public void addItem(String name, double price, int stock) {
        itemMap.put(name, new Item(name, price, stock));
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.customerName + " added to queue");
    }

    // Process billing
    public void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll();
        double totalBill = 0;

        System.out.println("\nBilling for: " + customer.customerName);

        for (String itemName : customer.items.keySet()) {

            int quantity = customer.items.get(itemName);

            if (!itemMap.containsKey(itemName)) {
                System.out.println(itemName + " not available");
                continue;
            }

            Item item = itemMap.get(itemName);

            if (item.stock < quantity) {
                System.out.println("Insufficient stock for " + itemName);
                continue;
            }

            double cost = item.price * quantity;
            totalBill += cost;
            item.stock -= quantity;

            System.out.println(itemName + " x " + quantity + " = ₹" + cost);
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }

    // Display remaining stock
    public void displayStock() {
        System.out.println("\n--- Stock Details ---");
        for (Item item : itemMap.values()) {
            System.out.println(item.name + " | Price: ₹" + item.price + " | Stock: " + item.stock);
        }
    }
}
