package SingleInheritance.SmartHomeDevices;

public class Device {
    private String deviceId;
    private boolean status;

    // constructor
    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "On" : "Off"));
    }
}
