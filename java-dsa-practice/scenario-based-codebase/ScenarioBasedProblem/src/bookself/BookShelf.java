package bookself;

import java.util.*;

public class BookShelf {

    private Map<String, LinkedList<Book>> catalog = new HashMap<>();
    private Set<String> bookSet = new HashSet<>(); 

    // Add book
    public void addBook(String genre, String bookName) {

        if (bookSet.contains(bookName.toLowerCase())) {
            System.out.println("Duplicate book not allowed");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(new Book(bookName));

        bookSet.add(bookName.toLowerCase());
        System.out.println(bookName + " added to " + genre);
    }

    // Borrow book
    public void borrowBook(String genre, String bookName) {
        LinkedList<Book> books = catalog.get(genre);

        if (books == null) {
            System.out.println("Genre not found");
            return;
        }

        for (Book book : books) {
            if (book.name.equalsIgnoreCase(bookName) && book.isAvailable) {
                book.isAvailable = false;
                System.out.println("Borrowed: " + bookName);
                return;
            }
        }
        System.out.println("Book not available");
    }

    // Return book
    public void returnBook(String genre, String bookName) {
        LinkedList<Book> books = catalog.get(genre);

        if (books == null) return;

        for (Book book : books) {
            if (book.name.equalsIgnoreCase(bookName)) {
                book.isAvailable = true;
                System.out.println("Returned: " + bookName);
                return;
            }
        }
    }

    // Display 
    public void displayGenreBooks( String genre) {
            for (Book book : catalog.get(genre)) {
                System.out.println("  " + book);
            }
    }
}
