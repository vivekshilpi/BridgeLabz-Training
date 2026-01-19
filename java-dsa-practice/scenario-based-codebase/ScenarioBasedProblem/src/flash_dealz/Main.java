package flash_dealz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();   // consume newline

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct " + (i + 1) + ":");

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();  // buffer clear

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Discount (%): ");
            double discount = sc.nextDouble();

            products[i] = new Product(id, name, discount);
        }

        // Apply Quick Sort
        QuickSort.quickSort(products, 0, n - 1);

        System.out.println("\n=== TOP DISCOUNTED PRODUCTS (SORTED) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        sc.close();
    }
}
