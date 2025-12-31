package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Create a Student class that extends Person class
public class Student extends Person{
    private int grade;

    // constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Create method to display student information
    public void displayStudentInfo() {
        displayBasicInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
