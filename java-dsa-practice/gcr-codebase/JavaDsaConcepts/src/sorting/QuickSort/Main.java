package sorting.QuickSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create an instance of scanner class
        Scanner sc = new Scanner(System.in);

        //get user input for the size of array
        System.out.print("Enter the size of productPrices array: ");
        int n = sc.nextInt();

        //initialize the productPrices array to store the productPrices of students
        int[] productPrices = new int[n];
        System.out.print("Enter products price: ");
        for(int i = 0; i < n ; i++){
            productPrices[i] = sc.nextInt();
        }

        //create and object of sort class
        Product sort = new Product();

        //invoke quick sort method to sort the productPrices array
        sort.quickSort(productPrices, 0, productPrices.length-1);

        //print the sorted array
        System.out.print("Your Sorted productPrices array is: [ ");
        for(int i : productPrices){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
