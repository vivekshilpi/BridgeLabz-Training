package AssistedProblems.EmployeeManagementSystem;

public class Intern extends Employee {
    private final String university;

    public Intern(String name, String id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    // Override displayDetails to include university
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}
