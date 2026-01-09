package medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Medicine Type:");
        System.out.println("1. Tablet");
        System.out.println("2. Syrup");
        System.out.println("3. Injection");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter medicine name: ");
        String name = sc.nextLine();

        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter expiry date (yyyy-mm-dd): ");
        LocalDate expiryDate = LocalDate.parse(sc.next());

        System.out.print("Enter quantity to sell: ");
        int quantity = sc.nextInt();

        ISellable medicine = null;

        switch (choice) {
            case 1:
                medicine = new Tablet(name, price, expiryDate);
                break;
            case 2:
                medicine = new Syrup(name, price, expiryDate);
                break;
            case 3:
                medicine = new Injection(name, price, expiryDate);
                break;
            default:
                System.out.println("Invalid medicine type");
                sc.close();
                return;
        }

        medicine.sell(quantity);

        sc.close();
    }
}
