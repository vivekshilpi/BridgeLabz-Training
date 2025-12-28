package com.constructor.level1;

public class BookLibrarySystemMain {
	public static void main(String[] args) {

        EBook ebook = new EBook("134685991", "Java", "James", 5.2);

        ebook.displayDetails();

        // Modifying author using setter
        ebook.setAuthor("James Gos");
        System.out.println("\nUpdated Author: " + ebook.getAuthor());
	}
}