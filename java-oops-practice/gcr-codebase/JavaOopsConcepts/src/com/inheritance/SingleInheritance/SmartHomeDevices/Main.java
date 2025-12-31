package SingleInheritance.SmartHomeDevices;

public class Main {
    public static void main(String[] args) {

        // Create object
        Thermostat homeThermostatus = new Thermostat("THERMO-001", true, 22.5);
        // call the method from the class here
        homeThermostatus.displayStatus();
    }
}
