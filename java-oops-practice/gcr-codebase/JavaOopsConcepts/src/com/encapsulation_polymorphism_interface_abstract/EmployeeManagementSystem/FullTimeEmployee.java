package EmployeeManagementSystem;

public class FullTimeEmployee extends Employee implements Department{
    private int bonus;
    private String department;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public FullTimeEmployee(int employeeId, String name, int baseSalary, int bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
//        this.department = department;
    }

    @Override
    public double calculateSalary() {

        return getBaseSalary()+bonus;
    }

    @Override
    public void assignDepartment(String department) {
        setDepartment(department);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Salary = "+calculateSalary());
        System.out.println("department : "+getDepartmentDetails());
    }

    @Override
    public String getDepartmentDetails() {
        return department;

    }
}
