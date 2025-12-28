package com.constructor.level1;

public class LibraryBookMain {
	public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook("Java Programming", "James Gosling", 599.0);

        b1.displayDetails();
        System.out.println();

        // Borrowing the book
        b1.borrowBook();
    }
}