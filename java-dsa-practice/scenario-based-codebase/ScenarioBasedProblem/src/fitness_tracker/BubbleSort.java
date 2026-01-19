package fitness_tracker;

class BubbleSort {

    public static void bubbleSort(User[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Sort in descending order (more steps first)
                if (arr[j].steps < arr[j + 1].steps) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(User[] arr, int i, int j) {
        User temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
