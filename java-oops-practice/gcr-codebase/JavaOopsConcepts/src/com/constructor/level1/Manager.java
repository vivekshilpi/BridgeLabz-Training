package com.constructor.level1;

public class Manager extends Employee{
	String managerLevel;

    // Constructor
    Manager(int employeeID, String department, double salary, String managerLevel){
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

	// Method demonstrating access to public and protected members
    void displayDetails() {
        System.out.println("Employee ID : " + employeeID);  
        System.out.println("Department  : " + department);   
        System.out.println("Salary      : ₹" + getSalary()); 
        System.out.println("Level       : " + managerLevel);
    }
}
