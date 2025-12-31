package AssistedProblems.EmployeeManagementSystem;

public class Developer extends Employee{
    private final String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayDetails to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Primary Language: " + programmingLanguage);
    }
}
