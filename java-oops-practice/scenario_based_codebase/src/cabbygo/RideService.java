package cabbygo;

public class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private double fare;   // sensitive
    private boolean rideActive;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        if (rideActive) {
            System.out.println("Ride already in progress");
            return;
        }

        fare = vehicle.calculateFare(distance);
        rideActive = true;

        System.out.println("Ride Booked!");
        System.out.println("Vehicle Type : " + vehicle.getType());
        driver.displayDriverInfo();
        System.out.println("Estimated Fare : " + fare);
    }

    @Override
    public void endRide() {
        if (!rideActive) {
            System.out.println("No active ride to end");
            return;
        }

        rideActive = false;
        System.out.println("Ride Ended");
        System.out.println("Final Fare : " + fare);
    }
}
