package binary_search_tree.ecommerce_product_inventory;

import java.util.Scanner;

public class ECommerceInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductBST inventory = new ProductBST();

        while (true) {
            System.out.println("""
            
            E-Commerce Product Inventory
            1. Add Product
            2. Search Product by SKU
            3. Update Product Price
            4. Display Products Sorted by SKU
            5. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter SKU: ");
                    int sku = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.insert(sku, name, price);
                    System.out.println("Product added.");
                }

                case 2 -> {
                    System.out.print("Enter SKU to search: ");
                    inventory.search(sc.nextInt());
                }

                case 3 -> {
                    System.out.print("Enter SKU to update price: ");
                    int sku = sc.nextInt();

                    System.out.print("Enter new price: ");
                    double price = sc.nextDouble();

                    inventory.updatePrice(sku, price);
                }

                case 4 -> inventory.displaySorted();

                case 5 -> {
                    System.out.println("Exiting system 👋");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

