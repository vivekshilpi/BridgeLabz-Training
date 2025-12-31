package AssistedProblems.VehicleandTransportSystem;

public class Main {
    public static void main(String[] args) {
        // Create an array of different vehicle types
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 15.5),
                new MotorCycle(200, "Petrol", false)
        };

        // Demonstrate polymorphism by calling displayInfo()
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("-------------------");
        }
    }
}
