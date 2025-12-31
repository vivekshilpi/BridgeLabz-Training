package AssistedProblems.VehicleandTransportSystem;

// Vehicle Superclass
abstract class Vehicle {

        // Common attributes
        private double maxSpeed;
        private String fuelType;

        // Constructor
        public Vehicle(double maxSpeed, String fuelType) {
            this.maxSpeed = maxSpeed;
            this.fuelType = fuelType;
        }

        // Method to display vehicle information
        public void displayInfo() {
            System.out.println("\nMax Speed: " + maxSpeed + " km/h");
            System.out.println("Fuel Type: " + fuelType);
        }

        // Getters
        public double getMaxSpeed() {
            return maxSpeed;
        }

        public String getFuelType() {
            return fuelType;
        }
}
