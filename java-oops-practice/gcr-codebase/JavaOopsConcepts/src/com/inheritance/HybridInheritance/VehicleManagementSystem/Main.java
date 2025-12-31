package HybridInheritance.VehicleManagementSystem;

public class Main {
    public static void main(String[] args) {

        // Create an object of Electric Vehicle class
        ElectricVehicle tesla = new ElectricVehicle("Model S", 250, 100);
        // call the methods of the created object
        tesla.displayInfo();
        tesla.charge();

        // Create an object of Petrol Vehicle class
        PetrolVehicle ford = new PetrolVehicle("Mustang", 180, 60);
        // call the methods of the created object
        ford.displayInfo();
        ford.refuel();
    }
}
