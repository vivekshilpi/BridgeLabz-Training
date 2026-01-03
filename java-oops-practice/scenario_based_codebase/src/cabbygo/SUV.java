package cabbygo;

public class SUV extends Vehicle {

    private static final double BASE_FARE = 120;

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV", 20);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + distance * ratePerKm;
    }
}
