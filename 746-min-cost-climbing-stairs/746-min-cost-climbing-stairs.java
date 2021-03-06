class Solution {
    public int minCostClimbingStairs(int[] cost) {
                
        for(int i = cost.length - 2; i >= 0; i--) {
            if(i == cost.length - 2) {
                cost[i] += Math.min(cost[i + 1], 0);
                continue;
            }
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }
        
        return Math.min(cost[0], cost[1]);
    }
}