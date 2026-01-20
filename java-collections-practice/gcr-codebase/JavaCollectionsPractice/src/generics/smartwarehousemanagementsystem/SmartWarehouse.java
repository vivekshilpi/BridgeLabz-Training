package generics.smartwarehousemanagementsystem;

import java.util.Scanner;

public class SmartWarehouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        while (true) {
            System.out.println("\n--- Smart Warehouse Menu ---");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Groceries");
            System.out.println("3. Add Furniture");
            System.out.println("4. View Electronics");
            System.out.println("5. View Groceries");
            System.out.println("6. View Furniture");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            if(choice==7) {
            	System.out.println("Thank you!");
            	break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter electronics name: ");
                    electronicsStorage.addItem(
                        new Electronics(sc.nextLine())
                    );
                    break;

                case 2:
                    System.out.print("Enter grocery name: ");
                    groceriesStorage.addItem(
                        new Groceries(sc.nextLine())
                    );
                    break;

                case 3:
                    System.out.print("Enter furniture name: ");
                    furnitureStorage.addItem(
                        new Furniture(sc.nextLine())
                    );
                    break;

                case 4:
                    System.out.println("Electronics Items:");
                    WarehouseUtil.displayItems(electronicsStorage.getItems());
                    break;

                case 5:
                    System.out.println("Grocery Items:");
                    WarehouseUtil.displayItems(groceriesStorage.getItems());
                    break;

                case 6:
                    System.out.println("Furniture Items:");
                    WarehouseUtil.displayItems(furnitureStorage.getItems());
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
