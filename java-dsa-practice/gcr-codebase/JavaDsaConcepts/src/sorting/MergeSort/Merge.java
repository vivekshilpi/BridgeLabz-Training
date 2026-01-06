package sorting.MergeSort;

public class Merge {
    static void merge(int[] bookPrices, int startIdx, int endIdx, int mid){
        int[] temp = new int[endIdx - startIdx + 1];
        int i = startIdx;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= endIdx ){
            if(bookPrices[i] < bookPrices[j]){
                temp[k++] = bookPrices[i++];
            }
            else{
                temp[k++] = bookPrices[j++];
            }
        }
        while(i <= mid){
            temp[k++] = bookPrices[i++];
        }
        while(j <= endIdx){
            temp[k++] = bookPrices[j++];
        }

        System.arraycopy(temp, 0, bookPrices, startIdx, temp.length);

    }
}
