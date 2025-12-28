package com.constructor.level1;

public class Course{
	
	// Instance variable
	String courseName;
	int duration;
	int fee;
	
	// Class variable
	static String instituteName; 
	
	Course(String courseName, int duration, int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	void displayCourseDetails() {
		System.out.println("Course name : " + courseName);
		System.out.println("Duration : " + duration);
		System.out.println("fee : " + fee);
		System.out.println("Institute name : " + instituteName);
	}
	
	static void updateInstituteName(String s) {
		instituteName = s;
	}
}
