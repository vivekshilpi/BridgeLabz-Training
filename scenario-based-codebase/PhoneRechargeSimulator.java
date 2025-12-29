import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double balance = 0;

        do {
            System.out.println("\n----- PHONE RECHARGE MENU -----");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. Exit");
            System.out.print("Select your operator: ");
            choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thank you for using Recharge Simulator!");
                break;
            }

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Jio Offer: 1GB/day for 28 days");
                    break;
                case 2:
                    System.out.println("Airtel Offer: Unlimited calls + 1.5GB/day");
                    break;
                case 3:
                    System.out.println("VI Offer: 2GB/day + weekend data rollover");
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            balance += amount;
            System.out.println("Recharge Successful!");
            System.out.println("Current Balance: ₹" + balance);

        } while (true);

        sc.close();
    }
}
