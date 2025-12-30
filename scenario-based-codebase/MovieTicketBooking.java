import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean moreCustomers = true;

        System.out.println("Welcome to Movie Ticket Booking System !");

        while (moreCustomers) {

            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Horror");
            System.out.print("Enter choice: ");
            int movieChoice = scanner.nextInt();

            int moviePrice = getMoviePrice(movieChoice);

            System.out.print("Choose Seat Type (Gold / Silver): ");
            String seatType = scanner.next();

            int seatPrice = seatType.equalsIgnoreCase("Gold") ? 200 : 120;

            System.out.print("Do you want snacks? (Yes/No): ");
            String wantSnacks = scanner.next();

            int snackPrice = 0;
            if (wantSnacks.equalsIgnoreCase("Yes")) {
                snackPrice = 100;
            }

            int totalBill = moviePrice + seatPrice + snackPrice;

            System.out.println("\n----- BILL DETAILS -----");
            System.out.println("Movie Price : ₹" + moviePrice);
            System.out.println("Seat Price  : ₹" + seatPrice);
            System.out.println("Snacks      : ₹" + snackPrice);
            System.out.println("Total Bill  : ₹" + totalBill);

            System.out.print("\nNext Customer? (Yes/No): ");
            moreCustomers = scanner.next().equalsIgnoreCase("Yes");
        }

        System.out.println("\nThank you for using Movie Ticket Booking System!");
        scanner.close();
    }

    // Switch based movie pricing
    static int getMoviePrice(int choice) {
        switch (choice) {
            case 1:
                return 180;
            case 2:
                return 150;
            case 3:
                return 200;
            default:
                System.out.println("Invalid movie choice. Default price applied.");
                return 150;
        }
    }
}
