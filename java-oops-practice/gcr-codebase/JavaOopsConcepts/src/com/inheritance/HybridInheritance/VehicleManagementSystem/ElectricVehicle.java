package HybridInheritance.VehicleManagementSystem;

// Create a subclass ElectricVehicle that extends Vehicle superclass
public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;

    // constructor
    public ElectricVehicle(String model, double maxSpeed, double batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Create a method to display the charge capacity of vehicle
    public void charge() {
        System.out.println("Charging vehicle with " + batteryCapacity + " kWh battery");
    }
}
