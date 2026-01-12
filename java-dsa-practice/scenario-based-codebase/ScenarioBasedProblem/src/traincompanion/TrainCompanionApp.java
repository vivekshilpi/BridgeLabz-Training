package traincompanion;

import java.util.Scanner;

public class TrainCompanionApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainCompanion train = new TrainCompanion();

        while (true) {
            System.out.println("\n--- Train Companion Menu ---");
            System.out.println("1. Add Compartment");
            System.out.println("2. Remove Compartment");
            System.out.println("3. Traverse Forward");
            System.out.println("4. Traverse Backward");
            System.out.println("5. Show Adjacent Compartments");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter compartment name: ");
                    String addName = sc.nextLine();
                    train.addCompartment(addName);
                    break;

                case 2:
                    System.out.print("Enter compartment name to remove: ");
                    String removeName = sc.nextLine();
                    train.removeCompartment(removeName);
                    break;

                case 3:
                    train.traverseForward();
                    break;

                case 4:
                    train.traverseBackward();
                    break;

                case 5:
                    System.out.print("Enter compartment name: ");
                    String adjName = sc.nextLine();
                    train.showAdjacent(adjName);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
