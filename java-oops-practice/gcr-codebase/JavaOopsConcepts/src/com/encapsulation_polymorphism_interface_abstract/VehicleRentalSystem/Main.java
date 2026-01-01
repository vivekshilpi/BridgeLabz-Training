package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike(1001,"Super Bike", 500,"BMW", 5);
        Car c1 = new Car(5005, "Rally car",2000,5,10);
        Truck t1 = new Truck(2432, "Coal mine truck",4500,45,16);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(b1);
        vehicles.add(c1);
        vehicles.add(t1);

        for(Vehicle vehicle : vehicles) {
            vehicle.getDetails();
            System.out.println();
        }
    }
}