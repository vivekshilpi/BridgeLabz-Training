package sorting.CountingSort;

public class SortStudentAges {
    public void countingSort(int[] ages) {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        // Step 1: Count array to store frequency of each age
        int[] count = new int[range];

        for (int age : ages) {
            count[age - minAge]++; // Normalize index (e.g., age 10 maps to index 0)
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in the correct position
        int[] sortedAges = new int[ages.length];

        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            sortedAges[count[age - minAge] - 1] = age;
            count[age - minAge]--; // Reduce count after placing the element
        }

        // Copy sorted elements back to original array
        System.arraycopy(sortedAges, 0, ages, 0, ages.length);
    }
}
