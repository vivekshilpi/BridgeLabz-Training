package hashmap.FindAllSubarrayswithZeroSum;

import java.util.HashMap;

public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        // Add the initial cumulative sum to the map
        sumMap.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // If sum has appeared before, it means there is a zero-sum subarray
            if (sumMap.containsKey(sum)) {
                // We found a subarray from the previous occurrence of this cumulative sum to the current index
                int startIndex = sumMap.get(sum) + 1;
                // Print the subarray
                System.out.print("Subarray with zero sum: ");
                for (int j = startIndex; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            // Put the current sum with its index in the map
            sumMap.put(sum, i);
        }
    }
}
