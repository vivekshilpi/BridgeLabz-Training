package SingleInheritance.SmartHomeDevices;

// Thermostat subclass inheriting the properties of Device superclass
public class Thermostat extends Device{
    private double temperature;

    // constructor
    public Thermostat(String deviceId, boolean status, double temperature) {
        super(deviceId, status);
        this.temperature = temperature;
    }

    // Override the displayStatus method from Device superclass
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature: " + temperature + "°C");
    }
}
