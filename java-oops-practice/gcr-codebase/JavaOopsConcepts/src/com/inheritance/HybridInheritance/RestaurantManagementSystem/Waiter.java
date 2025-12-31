package HybridInheritance.RestaurantManagementSystem;

public class Waiter extends Person implements Worker{
    private String section;

    // constructor
    public Waiter(String nameOfPerson, String id, String section) {
        super(nameOfPerson, id);
        this.section = section;
    }

    // Override method from the interface Worker
    @Override
    public void performDuties() {
        System.out.println(name + " is serving tables in " + section + " section");
    }
}
