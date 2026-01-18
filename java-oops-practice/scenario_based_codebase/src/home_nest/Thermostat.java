package home_nest;

public class Thermostat extends Device {

    Thermostat(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 20;
        System.out.println("Thermostat cooling started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat turned OFF");
    }

    public void reset() {
        System.out.println("Thermostat reset to 24°C");
    }
}