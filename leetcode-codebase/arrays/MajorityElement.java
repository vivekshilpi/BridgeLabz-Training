class Solution {
    public int majorityElement(int[] nums) {
        // 1. by sorting

        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

        // 2. by hashmap

        // int n= nums.length;
        // Map<Integer,Integer> freq = new HashMap<>();
        // for(int num:nums){
        //     freq.put(num,freq.getOrDefault(num,0)+1);
        //     if(freq.get(num)>n/2){
        //         return num;
        //     }
        // }
        // return 0;

        // 3. by using moore voting algo
        
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;

        
    }
}