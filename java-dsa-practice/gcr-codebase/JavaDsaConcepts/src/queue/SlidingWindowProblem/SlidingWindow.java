package queue.SlidingWindowProblem;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {

    public int[] slidingWindowMax(int arr[], int k){
        int n = arr.length;
        int[] result = new int[n-k+1];
        int resIndex = 0;

        //Create deque to store index
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++){

            //remove numbers which are out of windows range
            if(!dq.isEmpty() && dq.peek() == i - k){
                dq.poll();
            }

            //remove smaller element from the window's range as they are useless
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.pollLast();
            }

            dq.offer(i);
            if( i >= k - 1){
                result[resIndex++] = arr[dq.peek()];
            }
        }
        return result;
    }
}
