package generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marketplace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product<?>> catalog = new ArrayList<>();

        while (true) {

            System.out.println("\n--- Online Marketplace ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Gadget");
            System.out.println("4. Apply Discount");
            System.out.println("5. View Catalog");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==6) {
            	System.out.println("Thank you!");
            	break;
            }
            switch (choice) {

                case 1:
                    System.out.print("Enter book name: ");
                    catalog.add(new Product<>(
                            sc.nextLine(),
                            getPrice(sc),
                            new BookCategory()));
                    break;

                case 2:
                    System.out.print("Enter clothing name: ");
                    catalog.add(new Product<>(
                            sc.nextLine(),
                            getPrice(sc),
                            new ClothingCategory()));
                    break;

                case 3:
                    System.out.print("Enter gadget name: ");
                    catalog.add(new Product<>(
                            sc.nextLine(),
                            getPrice(sc),
                            new GadgetCategory()));
                    break;

                case 4:
                    System.out.print("Enter discount percentage: ");
                    double discount = sc.nextDouble();

                    for (Product<?> p : catalog) {
                        MarketplaceUtil.applyDiscount(p, discount);
                    }
                    break;

                case 5:
                    for (Product<?> p : catalog) {
                        p.display();
                    }
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }

    private static double getPrice(Scanner sc) {
        System.out.print("Enter price: ");
        return sc.nextDouble();
    }
}
