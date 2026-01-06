package sorting.HeapSort;

public class Heapsort {
    // Function to sort an array using Heap Sort
    static void heapSort(int[] salaries) {
        int n = salaries.length;
        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify.heapify(salaries, n, i);
        }
        // Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root with the last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            Heapify.heapify(salaries, i, 0);
        }
    }

    //method to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
