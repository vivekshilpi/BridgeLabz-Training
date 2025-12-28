package com.constructor.level1;

public class CourseMain {

	public static void main(String[] args) {
		Course c = new Course("BTech", 4, 75000);
		c.instituteName = "TIT";
		c.displayCourseDetails();
		
		c.updateInstituteName("Technocrats");
		System.out.println("After updation : ");
		c.displayCourseDetails();
	}

}
