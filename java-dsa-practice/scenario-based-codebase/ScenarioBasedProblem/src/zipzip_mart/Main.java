package zipzip_mart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total transactions today: ");
        int n = sc.nextInt();

        Transaction[] records = new Transaction[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter Date (YYYY-MM-DD): ");
            String date = sc.next();

            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();

            records[i] = new Transaction(date, amt);
        }

        ZipZipMartSorter.mergeSort(records, 0, records.length - 1);

        System.out.println("\n--- DAILY SORTED SALES REPORT ---");
        for(Transaction t : records) t.display();
    }
}
