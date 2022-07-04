class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candiesR[] = new int[n];
        int candiesL[] = new int[n];
        Arrays.fill(candiesR, 1);
        Arrays.fill(candiesL, 1);
        for(int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candiesL[i] += candiesL[i - 1]; 
            }
        }
        int sum = 0;
        candiesL[n - 1] = Math.max(candiesR[n - 1], candiesL[n - 1]);
        sum = candiesL[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                candiesR[i] += candiesR[i + 1]; 
            }
            candiesL[i] = Math.max(candiesL[i], candiesR[i]);
            sum += candiesL[i];
        }
        return sum;
    }
}