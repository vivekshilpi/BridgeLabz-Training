package crop_monitor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        SensorRecord[] readings = new SensorRecord[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Timestamp (milliseconds): ");
            long ts = sc.nextLong();

            System.out.print("Enter Soil Temperature (°C): ");
            double temp = sc.nextDouble();

            readings[i] = new SensorRecord(ts, temp);
        }

        System.out.println("\n--- BEFORE SORTING (Raw Drone Feed) ---");
        for (SensorRecord r : readings) r.display();

        CropMonitorSorter.quickSort(readings, 0, readings.length - 1);

        System.out.println("\n--- AFTER SORTING (Time-Ordered for Visualization) ---");
        for (SensorRecord r : readings) r.display();
    }
}
