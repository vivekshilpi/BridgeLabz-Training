package crop_monitor;

class CropMonitorSorter {

    static void quickSort(SensorRecord[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);

            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    static int partition(SensorRecord[] data, int low, int high) {

        long pivot = data[high].timestamp;   // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Sort in ascending order of timestamp (oldest → newest)
            if (data[j].timestamp <= pivot) {
                i++;

                // Swap records
                SensorRecord temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        // Place pivot in correct position
        SensorRecord temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
}
