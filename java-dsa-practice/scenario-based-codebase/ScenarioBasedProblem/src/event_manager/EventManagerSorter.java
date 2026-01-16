package event_manager;

class EventManagerSorter {

    static void quickSort(Ticket[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(Ticket[] arr, int low, int high) {

        double pivot = arr[high].price;  // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].price <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                Ticket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        Ticket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
