package com.constructor.level1;

public class Vehicle {
	// Instance variable
		String ownerName;
		String vehicleType;
		
		// Class variable
		static int registrationFee; 
		
		// Parameterized constructor
		Vehicle(String ownerName, String vehicleType){
			this.ownerName = ownerName;
			this.vehicleType = vehicleType;
		}
		
		// instance method
		void displayVehicleDetails() {
			System.out.println("Course name : " + ownerName);
			System.out.println("Duration : " + vehicleType);
			System.out.println("Registration : " + registrationFee);
		}
		
		// class method
		static void updateRegistrationFee(int fee) {
			registrationFee = fee;
		}
}
