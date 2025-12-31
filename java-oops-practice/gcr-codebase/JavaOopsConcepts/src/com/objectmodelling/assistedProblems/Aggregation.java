package com.objectmodelling.assistedProblems;

import java.util.ArrayList;
import java.util.List;


// Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters method
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Library class
class Library {
    private String name;
    private List<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooksDetails() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
// Main class
public class Aggregation {
    public static void main(String[] args) {
		
        // create the Book class object and call constructor
        Book book1 = new Book("Death: An Inside Story", "Sadhguru");
        Book book2 = new Book("Revolution 2020", "Chetan Bhagat");
        Book book3 = new Book("Half Girlfriend", "Chetan Bhagat");

        // Create library object and constructor to store library names
        Library library1 = new Library("City Library");
        Library library2 = new Library("Central Library");
	    Library library3 = new Library("CG Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2); // The same book can exist in multiple libraries
        library2.addBook(book3);
        library3.addBook(book3);
        library3.addBook(book1);
        library3.addBook(book2);

        // Display books in each library
        library1.displayBooksDetails();
        library2.displayBooksDetails();
	    library3.displayBooksDetails();
    }
}