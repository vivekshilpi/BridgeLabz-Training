/*
Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int FINE_PER_DAY = 5;

        System.out.println("---Rohan's Library Fine Calculator---");

        for (int bookNumber = 1; bookNumber <= 5; bookNumber++) {

            System.out.println("\nEnter details for Book " + bookNumber);

            System.out.print("Enter Due Date (in day number): ");
            int dueDate = scanner.nextInt();

            System.out.print("Enter Return Date (in day number): ");
            int returnDate = scanner.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * FINE_PER_DAY;

                System.out.println("Late by " + lateDays + " days.");
                System.out.println("Fine for Book " + bookNumber + " = ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine for Book " + bookNumber);
            }
        }

        System.out.println("\nAll book records processed. Thank you!");
        scanner.close();
    }
}
