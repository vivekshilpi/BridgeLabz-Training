package sorting.MergeSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create an instance of scanner class
        Scanner sc = new Scanner(System.in);

        //get user input for the size of array
        System.out.print("Enter the size of bookPrices array: ");
        int n = sc.nextInt();

        //initialize the bookPrices array to store the bookPrices of students
        int[] bookPrices = new int[n];
        System.out.print("Enter books price: ");
        for(int i = 0; i < n ; i++){
            bookPrices[i] = sc.nextInt();
        }

        //create and object of sort class
        Sort sort = new Sort();
        
        //invoke merge sort method to sort the bookPrices array
        sort.mergeSort(bookPrices, 0, bookPrices.length-1);

        //print the sorted array
        System.out.print("Your Sorted bookPrices array is: [ ");
        for(int i : bookPrices){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
