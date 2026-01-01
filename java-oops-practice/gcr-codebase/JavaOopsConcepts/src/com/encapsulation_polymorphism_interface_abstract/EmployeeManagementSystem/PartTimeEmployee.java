package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department{
    private int workHour;
    private int hourlySalary;
    private String department;
    @Override
    public double calculateSalary() {

        return getBaseSalary()+(double) (workHour*hourlySalary);
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public PartTimeEmployee(int employeeId, String name, int baseSalary, int workHour, int hourlySalary) {
        super(employeeId, name, baseSalary);
        this.workHour = workHour;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public void assignDepartment(String department) {

        setDepartment(department);
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("total salary = "+calculateSalary());
        System.out.println("Department = "+getDepartmentDetails());
    }
}
