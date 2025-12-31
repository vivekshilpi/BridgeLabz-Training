package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Create a Teacher class that extends Person class
public class Teacher extends Person{
    private String subject;

    // constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Create method to display teacher information
    public void displayTeacherInfo() {
        displayBasicInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
