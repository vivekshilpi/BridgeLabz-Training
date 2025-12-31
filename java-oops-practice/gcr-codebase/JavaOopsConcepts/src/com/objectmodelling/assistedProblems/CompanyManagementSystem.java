package com.objectmodelling.assistedProblems;

import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Get employee name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Department class
class Department {
    private String name;
    private List<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(String employeeName) {
        Employee newEmployee = new Employee(employeeName);
        employees.add(newEmployee);
    }

    // Display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(" - " + employee.getName());
        }
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

// Company class
class Company {
    private String name;
    private List<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(String departmentName) {
        Department newDepartment = new Department(departmentName);
        departments.add(newDepartment);
    }

    // Add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found.");
    }

    // Display company details
    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Delete the company (simulate deletion of all departments and employees)
    public void deleteCompany() {
        System.out.println("Deleting company " + name + "...");
        departments.clear();
        System.out.println("All departments and employees have been removed.");
    }
}

// Main class to demonstrate the company system
public class CompanyManagementSystem {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Add departments
        company.addDepartment("Engineering");
        company.addDepartment("Human Resources");

        // Add employees to departments
        company.addEmployeeToDepartment("Engineering", "Om");
        company.addEmployeeToDepartment("Engineering", "Harsh");
        company.addEmployeeToDepartment("Human Resources", "Bipin");
        // Display company details
        company.displayCompanyDetails();
        // Delete the company
        company.deleteCompany();
        // Try to display company details after deletion
        company.displayCompanyDetails();
    }
}
