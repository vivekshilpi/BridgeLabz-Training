package HybridInheritance.RestaurantManagementSystem;

// Create a class thats extends Person class and Person class implements Worker
// interface

public class Chef extends Person implements Worker {
    private String speciality;

    // constructor
    public Chef(String name, String id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    // Override method from the interface Worker
    @Override
    public void performDuties() {
        System.out.println( name + " is cooking " + speciality + " cuisine");
    }
}
