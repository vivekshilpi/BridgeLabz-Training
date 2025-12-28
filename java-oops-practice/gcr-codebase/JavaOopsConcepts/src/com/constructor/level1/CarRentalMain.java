package com.constructor.level1;

public class CarRentalMain {
	public static void main(String args[]) {
		CarRental cr = new CarRental("Akash","Scorpio",2,500);
		
		System.out.println("Price : " + cr.calculatePrice());
	}
}