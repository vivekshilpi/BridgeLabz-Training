package home_nest;

public class Lock extends Device {

    Lock(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 2;
        System.out.println("Door Locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Door Unlocked");
    }

    public void reset() {
        System.out.println("Lock reset: security keys refreshed");
    }
}