package parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    private List<String> bookingLogs = new ArrayList<>();

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied && vehicle.getClass().getSimpleName()
                .equalsIgnoreCase(vehicleTypeAllowed)) {

            isOccupied = true;
            bookingLogs.add("Vehicle parked: " + vehicle.getVehicleNumber());
            return true;
        }
        return false;
    }

    public void releaseSlot(Vehicle vehicle) {
        isOccupied = false;
        bookingLogs.add("Vehicle exited: " + vehicle.getVehicleNumber());
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    // 🔒 logs exposed safely
    public void showLogs() {
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}

