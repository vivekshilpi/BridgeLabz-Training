package smartHomeAutomationSystem;

class Light extends Appliance {

    public Light(int watts) {
        super(watts);
    }

    public void turnOn() {
        setPowerState(true);
        System.out.println("Light turned ON. Brightening room...");
    }

    public void turnOff() {
        setPowerState(false);
        System.out.println("Light turned OFF.");
    }
}

