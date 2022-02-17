class Solution {
    public int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int pr = 0;
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < least) {
                least = prices[i];
                continue;
            }
            pr = prices[i] - least;
            if(pr > profit) {
                profit = pr;
            }
        }
        return profit;
    }
}