package browser_buddy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserBuddy browser = new BrowserBuddy();

        int choice;

        do {
            System.out.println("\n------ BrowserBuddy Menu ------");
            System.out.println("1. Visit new page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close tab");
            System.out.println("5. Restore last closed tab");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visitPage(url);
                    break;

                case 2:
                    browser.back();
                    break;

                case 3:
                    browser.forward();
                    break;

                case 4:
                    browser.closeTab();
                    break;

                case 5:
                    browser.restoreTab();
                    break;

                case 6:
                    System.out.println("Exiting BrowserBuddy...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}

