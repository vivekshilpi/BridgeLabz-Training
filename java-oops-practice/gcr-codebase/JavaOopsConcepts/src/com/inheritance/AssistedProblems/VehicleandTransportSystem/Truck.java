package AssistedProblems.VehicleandTransportSystem;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(double maxSpeed, String fuelType, double cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    // Override displayInfo to include cargo capacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}
