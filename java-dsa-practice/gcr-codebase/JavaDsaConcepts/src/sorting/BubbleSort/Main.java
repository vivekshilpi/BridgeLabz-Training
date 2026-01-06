package sorting.BubbleSort;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            //create an instance of scanner class
            Scanner sc = new Scanner(System.in);

            //get user input for the size of array
            System.out.print("Enter the size of marks array: ");
            int n = sc.nextInt();

            //initialize the marks array to store the marks of students
            int[] marks = new int[n];
            System.out.print("Enter array elements: ");
            for(int i = 0; i < n ; i++){
                marks[i] = sc.nextInt();
            }

            //create an object of Sort class
            Sort sort = new Sort();

            //invoke bubble sort method to sort the marks array
            sort.bubbleSort(marks);

            //print the sorted array
            System.out.print("Your Sorted marks array is: [ ");
            for(int i : marks){
                System.out.print(i+" ");
            }
            System.out.print("]");
        }
    }
