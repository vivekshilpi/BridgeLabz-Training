package HybridInheritance.VehicleManagementSystem;

// Create interface refuelable
interface Refuelable {
    void refuel();
}
public class Vehicle {
    protected String model;
    protected double maxSpeed;

    // constructor
    public Vehicle(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Create a method to display info
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
