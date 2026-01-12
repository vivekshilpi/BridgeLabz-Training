package ambulance_route;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConnectingUnits route = new ConnectingUnits();

        System.out.print("Enter number of hospital units: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Dynamic input of units
        for (int i = 0; i < n; i++) {
            System.out.print("Enter unit name: ");
            String name = sc.nextLine();

            System.out.print("Is unit available? (true/false): ");
            boolean available = sc.nextBoolean();
            sc.nextLine();

            route.addUnit(name, available);
        }

        int choice;
        do {
            System.out.println("\n----- Ambulance Routing Menu -----");
            System.out.println("1. Display route");
            System.out.println("2. Admit patient (find available unit)");
            System.out.println("3. Remove unit (maintenance)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    route.displayRoute();
                    break;

                case 2:
                    route.findAvailable(); // NO return value now
                    break;

                case 3:
                    System.out.print("Enter unit name to remove: ");
                    String unitName = sc.nextLine();
                    route.removeUnit(unitName);
                    System.out.println("Unit removed if it existed.");
                    break;

                case 4:
                    System.out.println("System closed.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

