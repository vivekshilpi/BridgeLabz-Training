package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Create a Staff class that extends Person class
public class Staff extends Person {
    private String department;

    // constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Create method to display staff information
    public void displayStaffInfo() {
        displayBasicInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
