package com.constructor.level1;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();  // Default constructor
        Book b2 = new Book("Clean Code", "Robert C. Martin", 599.0);  // Parameterized constructor

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();

	}

}
