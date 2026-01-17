package smart_library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum books allowed: ");
        int n = sc.nextInt();

        Book[] borrowed = new Book[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter borrowed book title (or type 'STOP' to exit): ");
            String title = sc.next();

            if (title.equalsIgnoreCase("STOP")) break;

            borrowed[i] = new Book(title);

            SmartLibrary.insertAndSort(borrowed, i + 1);

            System.out.println("\nCurrent Borrowed List (Sorted):");
            for (int j = 0; j <= i; j++) {
                borrowed[j].display();
            }
        }
    }
}
