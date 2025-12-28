package com.constructor.level1;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle c = new Vehicle("Rashi", "Car");
		c.registrationFee  = 10000;
		c.displayVehicleDetails();
		
		c.updateRegistrationFee(15000);
		System.out.println("After updation : ");
		c.displayVehicleDetails();
	}

}
