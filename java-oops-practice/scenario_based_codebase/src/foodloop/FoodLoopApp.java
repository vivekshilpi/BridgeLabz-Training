package foodloop;

import java.util.*;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<FoodItem> menu = new ArrayList<>();

        // Menu
        menu.add(new VegItem("Paneer Butter Masala", 250, 5));
        menu.add(new VegItem("Veg Biryani", 200, 5));
        menu.add(new NonVegItem("Chicken Biryani", 300, 5));
        menu.add(new NonVegItem("Grilled Chicken", 400, 5));

        System.out.println("Welcome to FoodLoop");
        System.out.println("Menu:");

        for (FoodItem item : menu) {
            item.displayItem();
        }

        List<FoodItem> selectedItems = new ArrayList<>();

        System.out.print("\nHow many items do you want to order? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter food name: ");
            String choice = sc.nextLine();

            for (FoodItem item : menu) {
                if (item.getName().equalsIgnoreCase(choice) && item.isAvailable()) {
                    selectedItems.add(item);
                    item.reduceStock();
                }
            }
        }

        Order order = new Order(selectedItems);
        order.placeOrder();

        sc.close();
    }
}
	