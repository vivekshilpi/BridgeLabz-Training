package com.constructor.level1;

public class UniversityStudent{
	
	// Access modifiers
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	// Constructor
	UniversityStudent(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
	
	// Public getter for CGPA
    public double getCGPA(){
        return cgpa;
    }
	
    // Public setter for CGPA
    public void setCGPA(double cgpa){
        if (cgpa >= 0 && cgpa <= 10){
            this.cgpa = cgpa;
        }else{
            System.out.println("Invalid CGPA value");
        }
    }
}
