package com.constructor.level1;

public class UniversityStudentMain {

	public static void main(String[] args) {
		PostgraduateStudent pg = new PostgraduateStudent(101, "Rashi", 8.7, "Computer Science");

        pg.displayDetails();

        // Modifying CGPA using public method
        pg.setCGPA(9.1);
        System.out.println("\nUpdated CGPA: " + pg.getCGPA());

	}

}