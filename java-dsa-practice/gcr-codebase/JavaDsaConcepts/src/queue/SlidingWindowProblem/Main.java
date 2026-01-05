package queue.SlidingWindowProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create an instance of scanner class to take user inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the window size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the window size: ");
        int k = sc.nextInt();

        //create an object of SlidingWindow class
        SlidingWindow window = new SlidingWindow();

        //create a resultantArray to store result from slidingWindowMax method
        int[] resultantArray = window.slidingWindowMax(arr,k);

        //print the resultant array
        System.out.print("Sliding window maximum array is: [ ");
        for (int j : resultantArray) {
            System.out.print(j+" ");
        }
        System.out.println("]");
    }
}
