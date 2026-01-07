package linear_and_binarysearch.binarysearch;

import java.util.*;

public class FinalChallenge {

    // Linear Search: First Missing Positive
    static int firstMissingPositive(int[] arr) {

        boolean[] seen = new boolean[arr.length + 1];

        for (int num : arr) {
            if (num > 0 && num <= arr.length)
                seen[num] = true;
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!seen[i])
                return i;
        }

        return arr.length + 1;
    }

    // Binary Search
    static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Linear Search Part
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Number: " + missing);

        // Binary Search Part
        Arrays.sort(arr);

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        int index = binarySearch(arr, target);

        if (index != -1)
            System.out.println("Target found at index (after sorting): " + index);
        else
            System.out.println("Target not found");

        sc.close();
    }
}
