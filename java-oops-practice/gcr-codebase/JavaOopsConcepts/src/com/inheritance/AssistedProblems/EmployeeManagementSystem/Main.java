package AssistedProblems.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of different employee types
        Employee[] employees = {
                new Manager("Om Tiwari", "M001", 75000, 5),
                new Developer("Harshveer Singh", "D001", 65000, "Java"),
                new Intern("Bipin Sahu", "I001", 30000, "Tech University")
        };

        // Display details of each employee
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("-------------------");
        }
    }
}
