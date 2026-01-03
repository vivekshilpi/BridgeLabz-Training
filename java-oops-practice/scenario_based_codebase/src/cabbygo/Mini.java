package cabbygo;

public class Mini extends Vehicle {

    private static final double BASE_FARE = 50;

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini", 10);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + distance * ratePerKm;
    }
}
