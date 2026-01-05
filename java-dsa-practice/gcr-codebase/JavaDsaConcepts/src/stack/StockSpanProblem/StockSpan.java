package stack.StockSpanProblem;

import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements until we find a price greater than the current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Compute span 
            span[i] = stack.isEmpty()? (i + 1) : (i - stack.peek());

            // Push current index onto stack
            stack.push(i);
        }

        return span;
    }

}
