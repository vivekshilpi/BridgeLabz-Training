package pay_xpress;

import java.util.*;

public class PayXpressApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Bill> bills = new ArrayList<>();

        while (true) {

            System.out.println("\n--- PayXpress Menu ---");
            System.out.println("1. Add Bill");
            System.out.println("2. View Bills");
            System.out.println("3. Pay Bill");
            System.out.println("4. Send Reminders");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("Select Bill Type:");
                    System.out.println("1. Electricity  2. Water  3. Internet");
                    int type = sc.nextInt();

                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();

                    System.out.print("Enter due date: ");
                    String date = sc.next();

                    Bill b = switch (type) {
                        case 1 -> new ElectricityBill(amt, date);
                        case 2 -> new WaterBill(amt, date);
                        case 3 -> new InternetBill(amt, date);
                        default -> null;
                    };

                    if (b != null) {
                        bills.add(b);
                        System.out.println("Bill added successfully");
                    }
                }

                case 2 -> {
                    if (bills.isEmpty()) {
                        System.out.println("No bills available");
                        break;
                    }
                    for (int i = 0; i < bills.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        bills.get(i).showBill();
                    }
                }

                case 3 -> {
                    System.out.print("Select bill number to pay: ");
                    int idx = sc.nextInt() - 1;
                    bills.get(idx).pay();
                }

                case 4 -> {
                    for (Bill b : bills) {
                        if (!b.isPaid()) {
                            b.sendReminder();
                        }
                    }
                }

                case 5 -> {
                    System.out.println("PayXpress closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
