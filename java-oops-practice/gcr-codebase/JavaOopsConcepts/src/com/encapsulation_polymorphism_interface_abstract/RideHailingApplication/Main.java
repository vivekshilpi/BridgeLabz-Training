package RideHailingApplication;

public class Main {
    public static void CalculateFare(Vehicle[] vehicles, double distance) {
        for (Vehicle v :vehicles
        ) {
            v.getVehicleDetails();
            System.out.println("fare for "+ distance + " km $ " + v.calculateFare(distance));
            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("101","Om",250);
        Bike bike  = new Bike("102","Harshveer",100);
        Auto auto = new Auto("103","Bipin",20);

        //update location
        car.updateLocation("downtown");
        bike.updateLocation("city square");
        auto.updateLocation("airport");

        Vehicle[] vehicles ={car,bike,auto};
        CalculateFare(vehicles ,15);
    }
}