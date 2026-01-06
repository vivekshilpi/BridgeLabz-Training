package sorting.SelectionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create an instance of scanner class
        Scanner sc = new Scanner(System.in);

        //get user input for the size of array
        System.out.print("Enter the size of examScores array: ");
        int n = sc.nextInt();

        //initialize the examScores array to store the examScores of students
        int[] examScores = new int[n];
        System.out.print("Enter exam scores: ");
        for(int i = 0; i < n ; i++){
            examScores[i] = sc.nextInt();
        }

        //create and object of sort class
        SortExamScores sort = new SortExamScores();

        //invoke selection sort method to sort the examScores array
        sort.selectionSort(examScores);

        //print the sorted array
        System.out.print("Your Sorted examScores array is: [ ");
        for(int i : examScores){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
