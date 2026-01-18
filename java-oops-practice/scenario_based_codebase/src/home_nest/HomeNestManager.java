package home_nest;

import java.util.ArrayList;
import java.util.List;

public class HomeNestManager {

    private List<Device> devices = new ArrayList<>();

    // register device
    void addDevice(Device d) {
        devices.add(d);
        System.out.println("Device added: " + d.getDeviceId());
    }

    // turn ON device
    void turnOnDevice(String id) {
        Device d = findDevice(id);
        if (d != null) d.turnOn();
        else System.out.println("Device not found");
    }

    // turn OFF device
    void turnOffDevice(String id) {
        Device d = findDevice(id);
        if (d != null) d.turnOff();
        else System.out.println("Device not found");
    }

    // reset device 
    void resetDevice(String id) {
        Device d = findDevice(id);
        if (d != null) d.reset();
        else System.out.println("Device not found");
    }

    private Device findDevice(String id) {
        for (Device d : devices) {
            if (d.getDeviceId().equals(id))
                return d;
        }
        return null;
    }
}