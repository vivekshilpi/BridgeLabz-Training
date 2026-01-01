package EmployeeManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        PartTimeEmployee emp1 = new PartTimeEmployee(1, "Om Tiwari", 10000, 40, 500);
        emp1.assignDepartment("Engineering");

        FullTimeEmployee emp2 = new FullTimeEmployee(2,"HarshVeer",4000,50000);
        emp2.assignDepartment("Engineering");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        for(Employee employee : employees){

            employee.displayDetails();
            System.out.println();
        }


    }
}