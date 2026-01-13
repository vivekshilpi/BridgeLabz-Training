package smartcheckout;

import java.util.HashMap;

public class Customer {

    public String customerName;
    public HashMap<String, Integer> items; // itemName → quantity

    public Customer(String customerName) {
        this.customerName = customerName;
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        items.put(itemName, quantity);
    }
}
