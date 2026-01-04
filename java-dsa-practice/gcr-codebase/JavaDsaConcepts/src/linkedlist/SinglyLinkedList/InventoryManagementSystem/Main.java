package linkedlist.SinglyLinkedList.InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding items
        inventory.addItemAtEnd("Laptop", 101, 5, 50000);
        inventory.addItemAtEnd("Phone", 102, 10, 20000);
        inventory.addItemAtEnd("Tablet", 103, 7, 15000);

        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        // Updating quantity
        System.out.println("\nUpdating quantity for Item ID 101:");
        inventory.updateItemQuantity(101, 8);
        inventory.displayInventory();

        // Searching items
        System.out.println("\nSearching for Item by Name 'Phone':");
        inventory.searchItem(-1, "Phone");

        // Calculate total value
        System.out.println("\nCalculating Total Inventory Value:");
        inventory.calculateTotalValue();

        // Sorting inventory by price
        System.out.println("\nSorting Inventory by Price in Ascending Order:");
        inventory.sortInventory("price", true);
        inventory.displayInventory();
    }
}
