package flash_dealz;

class QuickSort {

    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(Product[] arr, int low, int high) {
        Product pivot = arr[high];   // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Sort in descending order (higher discount first)
            if (arr[j].discount >= pivot.discount) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Product[] arr, int i, int j) {
        Product temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
