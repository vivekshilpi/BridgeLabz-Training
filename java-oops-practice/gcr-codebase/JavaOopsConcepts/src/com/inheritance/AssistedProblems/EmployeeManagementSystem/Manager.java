package AssistedProblems.EmployeeManagementSystem;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Override displayDetails to include team size
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
