package com.constructor.level1;

public class PostgraduateStudent extends UniversityStudent{
	String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method demonstrating access to protected member
    void displayDetails() {
        System.out.println("Roll Number   : " + rollNumber); // public
        System.out.println("Name          : " + name);       // protected
        System.out.println("CGPA          : " + getCGPA());  // private via public method
        System.out.println("Specialization: " + specialization);
    }
}
