package fitness_tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of users (max 20): ");
        int n = sc.nextInt();
        sc.nextLine();   // consume newline

        User[] users = new User[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nUser " + (i + 1) + ":");

            System.out.print("Enter User ID: ");
            int id = sc.nextInt();
            sc.nextLine();  // buffer clear

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Steps: ");
            int steps = sc.nextInt();

            users[i] = new User(id, name, steps);
        }

        // Apply Bubble Sort
        BubbleSort.bubbleSort(users);

        System.out.println("\n=== DAILY STEP LEADERBOARD ===");

        for (int i = 0; i < users.length; i++) {
            System.out.println("Rank " + (i + 1) + " → " + users[i]);
        }

        sc.close();
    }
}
