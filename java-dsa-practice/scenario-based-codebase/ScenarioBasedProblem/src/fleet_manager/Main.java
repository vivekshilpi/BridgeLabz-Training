package fleet_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of depots: ");
        int depots = sc.nextInt();

        Vehicle[] masterList = new Vehicle[0];

        for (int d = 1; d <= depots; d++) {

            System.out.println("\n--- Depot " + d + " ---");
            System.out.print("Enter number of vehicles: ");
            int n = sc.nextInt();

            Vehicle[] depotList = new Vehicle[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Vehicle ID: ");
                String id = sc.next();

                System.out.print("Enter Mileage (km): ");
                int mileage = sc.nextInt();

                depotList[i] = new Vehicle(id, mileage);
            }

            // Assume each depot already sends a sorted list
            masterList = FleetMerger.mergeTwoDepots(masterList, depotList);
        }

        // Final global merge sort for consistency
        if (masterList.length > 0) {
            FleetMerger.mergeSort(masterList, 0, masterList.length - 1);
        }

        System.out.println("\n=== MASTER MAINTENANCE SCHEDULE (Low → High Mileage) ===");
        for (Vehicle v : masterList) {
            v.display();
        }
    }
}
