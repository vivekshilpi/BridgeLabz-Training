package smartHomeAutomationSystem;

abstract class Appliance implements Controllable {

    private boolean powerState;      // Encapsulated internal state
    private int powerConsumption;    // in Watts

    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.powerState = false;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    protected void setPowerState(boolean state) {
        powerState = state;
    }

    public boolean isOn() {
        return powerState;
    }
}

