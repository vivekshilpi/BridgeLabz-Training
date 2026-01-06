package sorting.QuickSort;

public class Product {
    public void quickSort(int[] productPrices, int startIdx, int endIdx){

        //base case
        if(startIdx >= endIdx){
            return;
        }

        //taking pivot value from partition method
        int pivotIdx = partion(productPrices, startIdx, endIdx);

        //recursive calls
        quickSort(productPrices, startIdx, pivotIdx-1);
        quickSort(productPrices, pivotIdx+1, endIdx);
    }

    public int partion(int[] productPrices, int startIdx, int endIdx){
        int pivot = productPrices[endIdx];

        int i = startIdx -1;

        //iterating from startIdx to endIdx
        for(int j = startIdx; j < endIdx; j++){
            if(productPrices[j] <= pivot){
                i++;

                //swap
                int temp = productPrices[j];
                productPrices[j] = productPrices[i];
                productPrices[i] = temp;
            }
        }
        i++;

        //swap
        int temp = pivot;
        productPrices[endIdx] = productPrices[i];
        productPrices[i] = temp;
        return i;
    }
}
