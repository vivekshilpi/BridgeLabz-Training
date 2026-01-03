package rentalVehicleApp;

class Bike extends Vehicle {

    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // No surcharge
    }
}

