package callcenter;

import java.util.Scanner;

public class CallCenterApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallCenter center = new CallCenter();

        System.out.print("Enter number of incoming calls: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Call " + (i + 1));

            System.out.print("Customer ID: ");
            String id = sc.nextLine();

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Is VIP? (true/false): ");
            boolean isVIP = sc.nextBoolean();
            sc.nextLine(); // consume newline

            Customer customer = new Customer(id, name, isVIP);
            center.receiveCall(customer);
        }

        System.out.print("\nEnter number of calls to handle: ");
        int handleCount = sc.nextInt();

        for (int i = 0; i < handleCount; i++) {
            center.handleCall();
        }

        center.displayCallStats();
    }
}
