package com.objectmodelling.selfProblems;

import java.util.ArrayList;

//University Class (Composition with Department, Aggregation with Faculty)
class University {
 private String universityName;
 private ArrayList<Department> departments;
 private ArrayList<Faculty> faculties;

 // Constructor
 public University(String universityName) {
     this.universityName = universityName;
     this.departments = new ArrayList<>();
     this.faculties = new ArrayList<>();
 }

 // Add a department to the university
 public void addDepartment(String departmentName) {
     Department department = new Department(departmentName);
     this.departments.add(department);
 }

 // Add a faculty to the university
 public void addFaculty(Faculty faculty) {
     faculties.add(faculty);
 }

 // Display university details
 public void displayUniversityDetails() {
     System.out.println("University: " + universityName);
     System.out.println("Departments:");
     for (Department department : departments) {
         System.out.println("  - " + department.getDepartmentName());
     }
     System.out.println("Faculty Members:");
     for (Faculty faculty : faculties) {
         System.out.println("  - " + faculty.getName());
     }
 }

 // Delete the university (composition: deletes departments)
 public void deleteUniversity() {
     departments.clear();
     System.out.println("University and all its departments have been deleted.");
 }
}

//Department Class (Part of University: Composition)
class Department {
 private String departmentName;

 // Constructor
 public Department(String departmentName) {
     this.departmentName = departmentName;
 }

 // Get the department name
 public String getDepartmentName() {
     return departmentName;
 }
}

//Faculty Class (Aggregation with University)
class Faculty {
 private String name;
 private String facultyId;

 // Constructor
 public Faculty(String name, String facultyId) {
     this.name = name;
     this.facultyId = facultyId;
 }

 // Get faculty name
 public String getName() {
     return name;
 }
}

//Main Class
public class UniversityManagementSystem {
 public static void main(String[] args) {
     // Create a university class object
     University university = new University("RGPV University");

     // Add departments to the university
     university.addDepartment("Computer Science Engg.");
     university.addDepartment("Mechanical Engineering");
     university.addDepartment("Physics");

     // Create faculty members
     Faculty faculty1 = new Faculty("Dr. Om Tiwari", "F001");
     Faculty faculty2 = new Faculty("Prof. HarshVeer Thakur", "F002");

     // Add faculty members to the university
     university.addFaculty(faculty1);
     university.addFaculty(faculty2);

     // Display university details
     university.displayUniversityDetails();

     // Demonstrate deletion of the university
     university.deleteUniversity();

     // Show that faculty members still exist independently
     System.out.println("Faculty members still exist:");
     System.out.println("  - " + faculty1.getName());
     System.out.println("  - " + faculty2.getName());
 }
}