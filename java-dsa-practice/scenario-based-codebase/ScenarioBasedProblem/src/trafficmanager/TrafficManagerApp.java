package trafficmanager;

import java.util.Scanner;

public class TrafficManagerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waiting queue capacity: ");
        int capacity = sc.nextInt();

        TrafficManager manager = new TrafficManager(capacity);

        while (true) {
            System.out.println("\n--- Traffic Manager Menu ---");
            System.out.println("1. Add Vehicle to Queue");
            System.out.println("2. Move Vehicle into Roundabout");
            System.out.println("3. Exit Vehicle from Roundabout");
            System.out.println("4. Display Roundabout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vNum = sc.nextLine();
                    manager.addToQueue(vNum);
                    break;

                case 2:
                    manager.enterRoundabout();
                    break;

                case 3:
                    System.out.print("Enter vehicle number to exit: ");
                    String exitNum = sc.nextLine();
                    manager.exitRoundabout(exitNum);
                    break;

                case 4:
                    manager.displayRoundabout();
                    break;

                case 5:
                    System.out.println("System shutting down...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
