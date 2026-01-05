package hashmap.TwoSumProblem;

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
        TwoSum two = new TwoSum();

        int[] result = two.indicesAddTarget(arr,target);

        //print the resultant array
        System.out.print("Indices are: [ ");
        for (int j : result) {
            System.out.print(j+" ");
        }
        System.out.println("]");
    }
}
