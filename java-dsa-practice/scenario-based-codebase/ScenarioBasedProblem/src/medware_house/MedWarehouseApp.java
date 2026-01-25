package medware_house;

import java.util.Scanner;

public class MedWarehouseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();

        Medicine[] medicines = new Medicine[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline

            System.out.println("\nEnter details for medicine " + (i + 1));
            System.out.print("Medicine Name: ");
            String name = sc.nextLine();

            System.out.print("Days until expiry: ");
            int days = sc.nextInt();

            medicines[i] = new Medicine(name, days);
        }

        MedWarehouse warehouse = new MedWarehouse();
        warehouse.mergeSort(medicines, 0, n - 1);

        System.out.println("\nMedicines Sorted by Expiry Date:");
        for (Medicine m : medicines) {
            m.display();
        }

        warehouse.expiryAlert(medicines, 10); // threshold = 10 days
        sc.close();
    }
}
