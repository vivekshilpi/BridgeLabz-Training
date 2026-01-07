package bookbazaar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name:");
        String user = sc.nextLine();

        Order order = new Order(user);

        System.out.println("Select Book Type:");
        System.out.println("1. EBook");
        System.out.println("2. Printed Book");

        int choice = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.println("Enter Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter Author:");
        String author = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        Book book;

        if (choice == 1) {
            book = new EBook(title, author, price);
        } else {
            System.out.println("Enter Stock:");
            int stock = sc.nextInt();
            book = new PrintedBook(title, author, price, stock);
        }

        order.addBook(book, quantity);

        System.out.println("\nOrder Status: " + order.getStatus());
        System.out.printf("Total Payable Amount: %.2f%n", order.calculateOrderTotal());

        sc.close();
    }
}

