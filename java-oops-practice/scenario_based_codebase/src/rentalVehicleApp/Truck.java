package rentalVehicleApp;

class Truck extends Vehicle {

    public Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        double loadCharge = 500;
        return (baseRate * days) + loadCharge;
    }
}
