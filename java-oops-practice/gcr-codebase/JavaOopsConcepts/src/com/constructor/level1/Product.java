package com.constructor.level1;

public class Product {
	
	// Instance variables 
    String productName;
    double price;

    // Class variable 
    static int totalProducts = 0;
    
    Product(String productName, double price){
    	this.productName = productName;
    	this.price = price;
    	totalProducts++;
    }

	void displayProductDetails() {
		System.out.println("Product name : " + productName);
		System.out.println("Price : " + price);
	}
	
	static void displayTotalProducts() {
		System.out.println("Total number of products : " + totalProducts);
	}
	
}