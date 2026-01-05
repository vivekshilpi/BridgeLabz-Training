package hashmap.PairwithGivenSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create an instance of scanner class to take user inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        PairSum.hasPairWithSum(arr, target);
    }

}
