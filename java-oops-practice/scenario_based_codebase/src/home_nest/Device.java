package home_nest;


abstract class Device implements IControllable {

    private String deviceId;       
    private boolean status;         
    protected double energyUsage;     

    Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.energyUsage = 0;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public void showEnergyUsage() {
        System.out.println("Energy Used: " + energyUsage + " units");
    }
}