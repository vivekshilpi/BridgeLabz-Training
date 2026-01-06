package sorting.MergeSort;

public class Sort {
    public void mergeSort(int bookPrices[], int startIdx, int endIdx){

        if(startIdx >= endIdx){
            return;
        }
        int mid = startIdx + (endIdx - startIdx) / 2;

        mergeSort(bookPrices, startIdx, mid);
        mergeSort(bookPrices, mid+1, endIdx);
        Merge.merge(bookPrices,startIdx,endIdx,mid);
    }
}
