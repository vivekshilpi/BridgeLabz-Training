package HybridInheritance.VehicleManagementSystem;

// Create a subclass PetrolVehicle that extends Vehicle and that implements the
// Refuelable

public class PetrolVehicle extends Vehicle implements Refuelable{
    private double fuelTankCapacity;

    // constructor
    public PetrolVehicle(String model, double maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Override the refuel method from the interface
    @Override
    public void refuel() {
        System.out.println("Refueling vehicle with " + fuelTankCapacity + " liter tank");
    }
}
