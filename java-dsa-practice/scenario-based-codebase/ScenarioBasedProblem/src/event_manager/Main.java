package event_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        Ticket[] tickets = new Ticket[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Event Name: ");
            String name = sc.next();

            System.out.print("Enter Ticket Price: ");
            double price = sc.nextDouble();

            tickets[i] = new Ticket(name, price);
        }

        System.out.println("\n--- BEFORE SORTING ---");
        for (Ticket t : tickets) t.display();

        EventManagerSorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\n--- AFTER SORTING (Cheapest First) ---");
        for (Ticket t : tickets) t.display();

        // Show Top 3 Cheapest (as example)
        System.out.println("\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < Math.min(3, tickets.length); i++) {
            tickets[i].display();
        }
    }
}
