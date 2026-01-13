package smartcheckout;

import java.util.Scanner;

public class SmartCheckoutApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();

        // Preload items
        checkout.addItem("Milk", 50, 20);
        checkout.addItem("Bread", 40, 15);
        checkout.addItem("Eggs", 6, 100);

        while (true) {
            System.out.println("\n--- Smart Checkout Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Customer");
            System.out.println("3. View Stock");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    Customer customer = new Customer(name);

                    while (true) {
                        System.out.print("Enter item name (or 'done'): ");
                        String item = sc.nextLine();
                        if (item.equalsIgnoreCase("done"))
                            break;

                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        sc.nextLine();

                        customer.addItem(item, qty);
                    }

                    checkout.addCustomer(customer);
                    break;

                case 2:
                    checkout.processCustomer();
                    break;

                case 3:
                    checkout.displayStock();
                    break;

                case 4:
                    System.out.println("System closed");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
