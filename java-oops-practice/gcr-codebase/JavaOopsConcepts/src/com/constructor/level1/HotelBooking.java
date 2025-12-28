package com.constructor.level1;

public class HotelBooking {
	
	// Attributes
	String guestName;
	String roomType;
	int nights;
	
	// Default constructor
	HotelBooking(){
		guestName = null;
		roomType = null;
		nights = 0;
	}
	
	// Parameterized constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	// Copy constructor
	HotelBooking(HotelBooking h){
		this.guestName = h.guestName;
		this.roomType = h.roomType;
		this.nights = h.nights;
	}
	
	void display(){
		System.out.println("Guest name : " + guestName);
		System.out.println("Room Type : " + roomType);
		System.out.println("Nights stayed : " + nights);
	}
	
}