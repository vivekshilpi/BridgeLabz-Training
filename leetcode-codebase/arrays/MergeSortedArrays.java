class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1; // Pointer for the last element in nums1
        int r2 = n - 1; // Pointer for the last element in nums2
        int w = m + n - 1; // Pointer for the last position in nums1, where the merged elements will be placed.

        while(w>=0){ //while loop runs until all elements are merged
        //compare the elements pointed to by r1 and r2
            while(r1>=0 && r2>=0){ 
                // nums1[w]=nums1[r1]>nums2[r2]?nums1[r1--]:nums2[r2--];
                if(nums1[r1]>nums2[r2]){
                    nums1[w]=nums1[r1];
                    r1--;
                    w--;
                }else{
                    nums1[w]=nums2[r2];
                    r2--;
                    w--;
                }
            }
            while(r1>=0){
                nums1[w]=nums1[r1--];
                w--;

            }
            while(r2>=0){
                nums1[w]=nums2[r2--];
                w--;
            }
            
        }
    }
}