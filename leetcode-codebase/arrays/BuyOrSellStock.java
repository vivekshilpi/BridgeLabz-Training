class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;
        for(int price:prices){
            buyPrice = Math.min(price,buyPrice);
            profit = Math.max(profit,price - buyPrice);
        }
        return profit;
    }
}