package com.constructor.level1;

public class Circle {
	
	double radius;
	
	// Default Constructor
    Circle() {
        this(1.0);   // Calls parameterized constructor
    }
    
    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }
	
}
