package smartHomeAutomationSystem;

class AC extends Appliance {

    public AC(int watts) {
        super(watts);
    }

    public void turnOn() {
        setPowerState(true);
        System.out.println("AC turned ON. Cooling started...");
    }

    public void turnOff() {
        setPowerState(false);
        System.out.println("AC turned OFF.");
    }
}
