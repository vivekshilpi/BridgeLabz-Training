package AssistedProblems.VehicleandTransportSystem;

public class Car extends Vehicle{
    private int seatCapacity;

    public Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override displayInfo to include seat capacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }

}
