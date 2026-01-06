package sorting.BubbleSort;

public class Sort {
    public void bubbleSort(int[] marks){

        //create a boolean variable swap to check if no swapping is done and break from the loop;
        boolean swap = false;

        //iterating in marks array using for loop
        for(int i = 0 ; i < marks.length; i++){
            for(int j = 0; j < marks.length - 1 -i; j++){

                //checking if next element is smaller than current element and do the swapping
                if(marks[j] > marks[j+1]){
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                    swap = true;
                }
            }
            //if swap is false then break
            if(!swap){
                break;
            }
        }
    }
}
