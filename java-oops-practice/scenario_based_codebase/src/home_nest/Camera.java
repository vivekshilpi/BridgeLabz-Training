package home_nest;

public class Camera extends Device {

    Camera(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 10;
        System.out.println("Camera recording started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera turned OFF");
    }

    public void reset() {
        System.out.println("Camera reset: lens recalibrated");
    }
}