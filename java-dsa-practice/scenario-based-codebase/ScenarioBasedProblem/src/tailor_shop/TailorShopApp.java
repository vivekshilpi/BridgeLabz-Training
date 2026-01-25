package tailor_shop;

import java.util.Scanner;

public class TailorShopApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        TailorShop shop = new TailorShop(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Order " + (i + 1));

            System.out.print("Order ID: ");
            int orderId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Customer Name: ");
            String customerName = sc.nextLine();

            System.out.print("Delivery Deadline (in days): ");
            int deadline = sc.nextInt();

            Order order = new Order(orderId, customerName, deadline);
            shop.addOrder(order);
        }

        shop.displayOrders();
        sc.close();
    }
}
