package cabbygo;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("MH12AB1234"); // polymorphism
        Driver driver = new Driver("Rohit", "DL12345", 4.8);

        IRideService rideService = new RideService(vehicle, driver);

        rideService.bookRide(12.5);
        System.out.println("------------------");
        rideService.endRide();
    }
}
