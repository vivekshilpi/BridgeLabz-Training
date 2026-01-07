package parkease;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Slot ID:");
        String slotId = sc.nextLine();

        System.out.println("Enter Location:");
        String location = sc.nextLine();

        System.out.println("Allowed Vehicle Type (Car/Bike/Truck):");
        String allowedType = sc.nextLine();

        ParkingSlot slot =
                new ParkingSlot(slotId, location, allowedType);

        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Vehicle Number:");
        String number = sc.nextLine();

        Vehicle vehicle = null;

        switch (choice) {
            case 1 -> vehicle = new Car(number);
            case 2 -> vehicle = new Bike(number);
            case 3 -> vehicle = new Truck(number);
            default -> {
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }

        if (slot.parkVehicle(vehicle)) {
            System.out.println("Vehicle parked successfully");

            System.out.println("Enter Parking Duration (hours):");
            int hours = sc.nextInt();

            double charges = vehicle.calculateCharges(hours);
            System.out.println("Total Parking Charges: ₹" + charges);

            slot.releaseSlot(vehicle);
        } else {
            System.out.println("Parking not allowed or slot occupied");
        }

        System.out.println("\nParking Logs:");
        slot.showLogs();

        sc.close();
    }
}

