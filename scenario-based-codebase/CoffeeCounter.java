import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gstRate = 0.05;   // 5% GST

        while (true) {
            System.out.println("\nEnter coffee type (espresso, cappuccino, latte, americano, mocha) or type 'exit' to stop:");
            String coffee = sc.next().toLowerCase();
            
            // program stops when user type "exit"
            if (coffee.equals("exit")) {
                System.out.println("Thank you for visiting Vivek's Cafe!");
                break;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            double price = 0;

            switch (coffee) {
                case "espresso":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                case "latte":
                    price = 170;
                    break;
                case "americano":
                    price = 140;
                    break;
                case "mocha":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            // Calculate bill, gst, or total amount

            double bill = price * qty;              
            double gst = bill * gstRate;
            double total = bill + gst;

            // Display Bill Details

            System.out.println("------ BILL DETAILS ------");
            System.out.println("Coffee Type : " + coffee);
            System.out.println("Quantity    : " + qty);
            System.out.println("Base Amount : ₹" + bill);
            System.out.println("GST (5%)    : ₹" + gst);
            System.out.println("Total Bill  : ₹" + total);
        }

        sc.close();
    }
}
