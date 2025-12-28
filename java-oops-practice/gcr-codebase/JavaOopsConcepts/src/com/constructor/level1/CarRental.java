package com.constructor.level1;

public class CarRental {
	
	// Attributes
	String customerName;
	String carModel;
	int rentalDays;
	int rentalPrice;
	
	// Parameterized constructor
	CarRental(String customerName, String carModel, int rentalDays, int rentalPrice){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.rentalPrice = rentalPrice;
	}
	
	int calculatePrice() {
		int price = rentalDays * rentalPrice;
		return price;
	}
	
}