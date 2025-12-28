package com.constructor.level1;

public class EmployeeMain {
	public static void main(String[] args) {

        Manager manager = new Manager( 501,"IT", 75000, "Senior Manager");

        manager.displayDetails();

        // Modify salary using public method
        manager.setSalary(85000);

        System.out.println("\nUpdated Salary: ₹" + manager.getSalary());
    }
}