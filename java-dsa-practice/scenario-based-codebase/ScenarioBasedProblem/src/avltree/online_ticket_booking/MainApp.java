package avltree.online_ticket_booking;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        EventBST bst = new EventBST();

        while (true)
        {
            System.out.println("\nOnline Ticket Booking System");
            System.out.println("1. Add Event");
            System.out.println("2. Cancel Event");
            System.out.println("3. Show Upcoming Events");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Event Time (e.g. 1830): ");
                    int time = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Event Name: ");
                    String name = sc.nextLine();

                    bst.root = bst.insert(bst.root, time, name);
                    System.out.println("Event added successfully");
                    break;

                case 2:
                    System.out.print("Enter Event Time to cancel: ");
                    int t = sc.nextInt();
                    bst.root = bst.delete(bst.root, t);
                    System.out.println("Event cancelled");
                    break;

                case 3:
                    System.out.println("Upcoming Events:");
                    bst.display(bst.root);
                    break;

                case 4:
                    System.out.println("Program ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
