package sorting.HeapSort;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    // Main method to test Heap Sort
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the size of salary array: ");
        int numOfEmployees=input.nextInt();

        //ARRAY TO STORE SALARIES OF EMPLOYEES
        int salaries[]=new int[numOfEmployees];
        //loop to take input from user
        System.out.print("Enter Salary: ");
        for(int i=0;i<salaries.length;i++){
            salaries[i]=input.nextInt();
        }
        System.out.print("Original salary demands: " );
        Heapsort.printArray(salaries);

        Heapsort.heapSort(salaries);

        System.out.print("Sorted salary demands: " );
        Heapsort.printArray(salaries);
    }
}
