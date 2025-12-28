package com.constructor.level1;

public class HotelBookingMain {
	
	public static void main(String[] args) {
		
		System.out.println("Default constructor HB : ");
		HotelBooking hb1 = new HotelBooking();
		hb1.display();
		
		System.out.println("Parameterized constructor HB : ");
		HotelBooking hb2 = new HotelBooking("Ram", "AC", 2);
		hb2.display();
		
		System.out.println("Copy constructor HB : ");
		HotelBooking hb3 = new HotelBooking(hb2);
		hb2.display();

	}
}