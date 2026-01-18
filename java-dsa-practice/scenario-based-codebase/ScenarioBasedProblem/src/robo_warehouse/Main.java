package robo_warehouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shelf capacity (max packages): ");
        int n = sc.nextInt();

        Package[] shelf = new Package[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Package ID (or type STOP to exit): ");
            String id = sc.next();

            if (id.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter Package Weight (kg): ");
            double weight = sc.nextDouble();

            shelf[i] = new Package(id, weight);

            // Insert into sorted position
            RoboWarehouse.insertInOrder(shelf, i + 1);

            System.out.println("\nCurrent Shelf (Light → Heavy):");
            for (int j = 0; j <= i; j++) {
                shelf[j].display();
            }
        }
    }
}
