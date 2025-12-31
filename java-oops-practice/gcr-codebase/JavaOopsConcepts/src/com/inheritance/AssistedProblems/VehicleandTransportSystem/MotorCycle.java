package AssistedProblems.VehicleandTransportSystem;

class MotorCycle extends Vehicle{
    private boolean hasSidecar;

    public MotorCycle(double maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Override displayInfo to include sidecar information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }

}
