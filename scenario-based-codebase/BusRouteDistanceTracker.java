/*
Bus Route Distance Tracker 
Each stop adds distance.
- Ask if the passenger wants to get off at a stop.
- Use a while-loop with a total distance tracker.
- Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalDistance = 0.0;
        int stopNumber = 1;
        boolean continueJourney = true;

        while (continueJourney) {

            System.out.print("Enter distance from stop " + stopNumber + " (in km): ");
            double distance = sc.nextDouble();
            totalDistance += distance;

            System.out.println("Total distance covered: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                continueJourney = false;
            } else {
                stopNumber++;
            }
        }

        System.out.println("Journey ended. Final distance: " + totalDistance + " km");
        sc.close();
    }
}