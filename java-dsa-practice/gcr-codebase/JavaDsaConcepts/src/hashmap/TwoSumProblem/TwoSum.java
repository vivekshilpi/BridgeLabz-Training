package hashmap.TwoSumProblem;

import java.util.HashMap;

public class TwoSum {
    public int[] indicesAddTarget(int[] arr, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                result[0] = hm.get(arr[i]);
                result[1] = i ;
                break;
            }
            else{
                hm.put(target-arr[i] , i);
            }
        }
        return result;
    }
}
