package crop_monitor;

class SensorRecord {
    long timestamp;      // Epoch time in milliseconds
    double temperature;  // Soil temperature in °C

    SensorRecord(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    void display() {
        System.out.println(timestamp + " | " + temperature + "°C");
    }
}
