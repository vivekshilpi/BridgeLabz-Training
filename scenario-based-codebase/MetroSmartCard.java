import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 200;   // Initial Smart Card Balance
        int distance, fare;
        char choice;

        System.out.println("Delhi Metro Smart Card System");
        System.out.println("Initial Balance: ₹" + balance);

        do {
            if (balance <= 0) {
                System.out.println("Your balance is exhausted.");
                break;
            }

            System.out.print("\nEnter distance travelled (in km): ");
            distance = sc.nextInt();

            // Fare calculation using ternary operator
            fare = (distance <= 5) ? 10 :
                   (distance <= 15) ? 20 :
                   (distance <= 25) ? 30 : 40;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare Charged: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient Balance!");
                break;
            }

            System.out.print("Do you want to travel again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Delhi Metro");
        sc.close();
    }
}
