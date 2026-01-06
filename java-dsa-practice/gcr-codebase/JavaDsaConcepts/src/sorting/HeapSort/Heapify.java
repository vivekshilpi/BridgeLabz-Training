package sorting.HeapSort;

public class Heapify {
    // heapify method
    public static void heapify(int[] arr, int n, int i) {
        // Initialize largest as root
        int largest = i;
        //left and right child
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
