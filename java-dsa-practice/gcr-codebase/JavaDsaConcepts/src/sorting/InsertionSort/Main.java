package sorting.InsertionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create an instance of scanner class
        Scanner sc = new Scanner(System.in);

        //get user input for the size of array
        System.out.print("Enter the size of employeesID array: ");
        int n = sc.nextInt();

        //initialize the employeesID array to store the employeesID of students
        int[] employeesID = new int[n];
        System.out.print("Enter employee ID's : ");
        for(int i = 0; i < n ; i++){
            employeesID[i] = sc.nextInt();
        }

        //create an object of Sort class
        Sort sort = new Sort();

        //invoke insertion sort method to sort the employeesID array
        sort.insertionSort(employeesID);

        //print the sorted array
        System.out.print("Your Sorted employeesID array is: [ ");
        for(int i : employeesID){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
