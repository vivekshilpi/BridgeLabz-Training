package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

public class Person {
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Create method to display basic information
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
