package sorting.CountingSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the total Scores
        System.out.print("Enter the ages array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the ages between 10 to 18: ");
        // Taking the user Input of student marks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        SortStudentAges sort = new SortStudentAges();
        // sort the array
        try{
            sort.countingSort(arr);
            System.out.print("Ages after sorting: [ ");
            System.out.print(Arrays.toString(arr));
            System.out.print("]");
        }catch (Error e){
            System.out.println("Error caught invalid input please check and re-enter");
        }
    }
}
