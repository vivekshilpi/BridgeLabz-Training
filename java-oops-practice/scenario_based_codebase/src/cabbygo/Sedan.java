package cabbygo;

public class Sedan extends Vehicle {

    private static final double BASE_FARE = 80;

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan", 15);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + distance * ratePerKm;
    }
}
