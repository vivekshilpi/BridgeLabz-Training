package bookself;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        // Preload books 
        shelf.addBook("Action", "Die Hard");
        shelf.addBook("Action", "Mad Max");
        shelf.addBook("Action", "John Wick");
        shelf.addBook("Action", "Gladiator");

        shelf.addBook("Fiction", "1984");
        shelf.addBook("Fiction", "Animal Farm");
        shelf.addBook("Fiction", "The Alchemist");
        shelf.addBook("Fiction", "Dune");

        shelf.addBook("Mystery", "Gone Girl");
        shelf.addBook("Mystery", "Sherlock Holmes");
        shelf.addBook("Mystery", "The Girl with the Dragon Tattoo");
        shelf.addBook("Mystery", "Da Vinci Code");

        shelf.addBook("Comedy", "Boss Baby");
        shelf.addBook("Comedy", "Home Alone");
        shelf.addBook("Comedy", "Mr Bean");
        shelf.addBook("Comedy", "The Mask");

        int choice;
        do {
            System.out.println("\n----- Library Menu -----");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) {
                System.out.println("Exiting Library System...");
                break;
            }

            System.out.print("Enter genre (Action/Fiction/Mystery/Comedy): ");
            String genre = sc.nextLine();

            System.out.println("\nAvailable books in " + genre + ":");
            shelf.displayGenreBooks(genre);

            System.out.print("\nEnter book name: ");
            String bookName = sc.nextLine();

            if (choice == 1) {
                shelf.borrowBook(genre, bookName);
            } else if (choice == 2) {
                shelf.returnBook(genre, bookName);
            } else {
                System.out.println("Invalid choice!");
            }

        } while (true);

        sc.close();
    }
}
