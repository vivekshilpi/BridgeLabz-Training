package com.constructor.level1;

public class Person {
	
	String name;
	int age;
	String mobile;
	
	// Parameterized constructor
	Person(String name, int age, String mobile){
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	// Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
        this.mobile = p.mobile;
    }

    // Method to display details
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Mobile : " + mobile);
    }
	
}
