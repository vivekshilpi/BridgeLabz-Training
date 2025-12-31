package com.objectmodelling.selfProblems;

import java.util.ArrayList;
import java.util.List;

// Class representing a Courses
class Course {
    private String courseName;
    private Professor professor; // Aggregation: A course "has-a" professor
    private List<Student> enrolledStudents; // Association: Students are linked to courses

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + courseName);
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "No professor assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Class representing a Professor
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class representing a Student
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class to demonstrate the University Management System
public class UniversityManagementSystem2 {
    public static void main(String[] args) {
        // Create professors
        Professor professorJohn = new Professor("Prof. Harshveer Thakur");
        Professor professorJane = new Professor("Prof. Bipin sahu");

        // Create students
        Student studentAlice = new Student("Om");
        Student studentBob = new Student("Durgesh");
        Student studentCharlie = new Student("Aryan");

        // Create courses
        Course mathCourse = new Course("Mathematics");
        Course csCourse = new Course("Computer Science");

        // Assign professors to courses
        mathCourse.assignProfessor(professorJohn);
        csCourse.assignProfessor(professorJane);

        // Enroll students in courses
        mathCourse.enrollStudent(studentAlice);
        mathCourse.enrollStudent(studentBob);
        csCourse.enrollStudent(studentCharlie);
        csCourse.enrollStudent(studentAlice);

        // Display course details
        mathCourse.displayCourseDetails();
        System.out.println();
        csCourse.displayCourseDetails();
    }
}