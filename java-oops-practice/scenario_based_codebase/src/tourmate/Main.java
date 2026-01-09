package tourmate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n=== TourMate Menu ===");
            System.out.println("1. Book Domestic Trip");
            System.out.println("2. Book International Trip");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Thank you for using TourMate");
                break;
            }

            sc.nextLine(); // clear buffer

            System.out.print("Enter destination: ");
            String destination = sc.nextLine();

            System.out.print("Enter duration (days): ");
            int duration = sc.nextInt();

            System.out.print("Enter transport cost: ");
            double transportCost = sc.nextDouble();

            System.out.print("Enter hotel cost: ");
            double hotelCost = sc.nextDouble();

            System.out.print("Enter activity cost: ");
            double activityCost = sc.nextDouble();

            Transport transport = new Transport(transportCost);
            Hotel hotel = new Hotel(hotelCost);
            Activity activity = new Activity(activityCost);

            Trip trip;

            if (choice == 1) {
                trip = new DomesticTrip(destination, duration, transport, hotel, activity);
            } else if (choice == 2) {
                trip = new InternationalTrip(destination, duration, transport, hotel, activity);
            } else {
                System.out.println("Invalid option");
                continue;
            }

            trip.book();

            System.out.print("Cancel trip? (yes/no): ");
            if (sc.next().equalsIgnoreCase("yes")) {
                trip.cancel();
            }
        }

        sc.close();
    }
}
