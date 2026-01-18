package home_nest;

public class Light extends Device {

    Light(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 5; // operator usage
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light turned OFF");
    }

    public void reset() {
        System.out.println("Light reset: brightness restored");
    }
}