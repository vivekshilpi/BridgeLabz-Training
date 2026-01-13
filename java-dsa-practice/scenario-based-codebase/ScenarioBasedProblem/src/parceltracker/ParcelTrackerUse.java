package parceltracker;

import java.util.Scanner;

public class ParcelTrackerUse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        while (true) {
            System.out.println("--- Parcel Tracker Menu ---");
            System.out.println("1. Add Delivery Stage");
            System.out.println("2. Add Custom Checkpoint");
            System.out.println("3. Track Parcel");
            System.out.println("4. Mark Parcel as Lost");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter stage name: ");
                    String stage = sc.nextLine();
                    tracker.addStage(stage);
                    break;

                case 2:
                    System.out.print("Enter existing stage: ");
                    String afterStage = sc.nextLine();
                    System.out.print("Enter new checkpoint: ");
                    String newStage = sc.nextLine();
                    tracker.addCheckpoint(afterStage, newStage);
                    break;

                case 3:
                    tracker.trackParcel();
                    break;

                case 4:
                    tracker.markParcelLost();
                    break;

                case 5:
                    System.out.println("Exiting Parcel Tracker...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
