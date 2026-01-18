package artexpo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum artists expected: ");
        int n = sc.nextInt();

        Artist[] registrations = new Artist[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Artist Name (or STOP to exit): ");
            String name = sc.next();

            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter Registration Timestamp (milliseconds): ");
            long time = sc.nextLong();

            registrations[i] = new Artist(name, time);

            // Insert into sorted position
            ArtExpoSorter.insertByTime(registrations, i + 1);

            System.out.println("\nCurrent Registration Order (Earliest → Latest):");
            for (int j = 0; j <= i; j++) {
                registrations[j].display();
            }
        }
    }
}
