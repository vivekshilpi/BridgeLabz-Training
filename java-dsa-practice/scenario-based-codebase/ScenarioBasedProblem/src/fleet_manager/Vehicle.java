package fleet_manager;

class Vehicle {
    String vehicleId;
    int mileage;   // Kilometers driven

    Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    void display() {
        System.out.println(vehicleId + " → " + mileage + " km");
    }
}
