package fleet_manager;

class FleetMerger {

    // Merge two already sorted depot lists into one master list
    static Vehicle[] mergeTwoDepots(Vehicle[] d1, Vehicle[] d2) {

        int n1 = d1.length, n2 = d2.length;
        Vehicle[] merged = new Vehicle[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge in ascending order of mileage (least → most)
        while (i < n1 && j < n2) {
            if (d1[i].mileage <= d2[j].mileage) {
                merged[k++] = d1[i++];
            } else {
                merged[k++] = d2[j++];
            }
        }

        while (i < n1) merged[k++] = d1[i++];
        while (j < n2) merged[k++] = d2[j++];

        return merged;
    }

    // Final safety sort on the consolidated master list
    static void mergeSort(Vehicle[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(Vehicle[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i].mileage <= R[j].mileage) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
