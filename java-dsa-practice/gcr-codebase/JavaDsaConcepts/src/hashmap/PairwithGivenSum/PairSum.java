package hashmap.PairwithGivenSum;

import java.util.HashMap;

public class PairSum {

    public static void hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            // Check if temp exists in HashMap
            if (numMap.containsKey(temp)) {
                System.out.println(arr[i] + " " + temp);
            }
            // Store current number in HashMap
            numMap.put(arr[i], i);
        }

    }
}
