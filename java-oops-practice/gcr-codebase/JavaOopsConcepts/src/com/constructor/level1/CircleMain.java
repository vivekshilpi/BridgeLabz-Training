package com.constructor.level1;

import java.util.Scanner;

public class CircleMain {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the radius : ");
    	double radius = sc.nextDouble();
    	
        // Using default constructor
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.radius);
        System.out.println("Area: " + c1.calculateArea());

        System.out.println();

        // Using parameterized constructor
        Circle c2 = new Circle(radius);
        System.out.println("Radius: " + c2.radius);
        System.out.println("Area: " + c2.calculateArea());
    }
	
}
