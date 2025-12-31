package com.objectmodelling.selfProblems;

import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String name;
    private List<Student> enrolledStudents;

    // Constructor
    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // Bidirectional association
        }
    }

    // Get the name of the course
    public String getName() {
        return name;
    }

    // Display students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;
    private List<Course> courses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Bidirectional association
        }
    }

    // Get the name of the student
    public String getName() {
        return name;
    }

    // Display courses the student is enrolled in
    public void displayEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(" - " + course.getName());
        }
    }
}

// School class
class School {
    private String name;
    private List<Student> students;

    // Constructor
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students in the school
    public void displayStudents() {
        System.out.println("Students at " + name + ":");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Main class to demonstrate the school system
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Technocrats School");

        // Create students
        Student student1 = new Student("Om");
        Student student2 = new Student("Harsh");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(math);

        // Display school students
        school.displayStudents();

        // Display courses for each student
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();

        // Display students enrolled in each course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
    }
}
