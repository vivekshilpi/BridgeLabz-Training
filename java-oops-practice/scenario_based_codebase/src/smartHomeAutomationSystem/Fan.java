package smartHomeAutomationSystem;

class Fan extends Appliance {

    public Fan(int watts) {
        super(watts);
    }

    public void turnOn() {
        setPowerState(true);
        System.out.println("Fan turned ON. Air circulating...");
    }

    public void turnOff() {
        setPowerState(false);
        System.out.println("Fan turned OFF.");
    }
}
