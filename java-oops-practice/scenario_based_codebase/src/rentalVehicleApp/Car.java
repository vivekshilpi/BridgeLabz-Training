package rentalVehicleApp;

class Car extends Vehicle {

    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        double insurance = 200;
        return (baseRate * days) + insurance;
    }
}

