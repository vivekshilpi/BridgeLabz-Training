package com.constructor.level1;
// create class book
public class Book {
	// attributes of book
	public String title;
	public String author;
	public double price;
	
	// default constructor
	Book(){
		title = "Rich Dad Poor Dad";
		author = "Robert";
		price = 120.0;
	}
	
	// parameterized constructor
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}
