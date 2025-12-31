package HybridInheritance.RestaurantManagementSystem;

// Create an interface Worker
interface Worker {
    // empty method without body
    void performDuties();
}

// Create a class Person
public class Person {
    protected String name;
    protected String id;

    // constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
