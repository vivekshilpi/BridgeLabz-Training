package com.constructor.level1;

public class PersonMain {
	public static void main(String[] args) {
		// Original object
        Person p1 = new Person("Shila", 20, "9955227711");

        // Cloned object using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        p1.display();

        System.out.println("\nCopied Person:");
        p2.display();
	}
}