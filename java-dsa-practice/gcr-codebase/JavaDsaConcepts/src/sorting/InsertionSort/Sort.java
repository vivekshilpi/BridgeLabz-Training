package sorting.InsertionSort;

public class Sort {

    public void insertionSort(int[] employeesID){
        for(int i = 1; i < employeesID.length; i++){
            int temp = employeesID[i];
            int j = i - 1;
            while(j >= 0 && employeesID[j] > temp){
                employeesID[j+1] = employeesID[j];
                j--;
            }
            employeesID[j+1] = temp;
        }
    }
}
