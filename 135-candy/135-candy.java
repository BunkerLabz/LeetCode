class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int l2r[] = new int[n];
        int candiesL[] = new int[n];
        Arrays.fill(l2r, 1);
        Arrays.fill(candiesL, 1);
        for(int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candiesL[i] += candiesL[i - 1]; 
            }
        }
        int sum = 0;
        candiesL[n - 1] = Math.max(l2r[n - 1], candiesL[n - 1]);
        sum = candiesL[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                l2r[i] += l2r[i + 1]; 
            }
            candiesL[i] = Math.max(candiesL[i], l2r[i]);
            sum += candiesL[i];
        }
        return sum;
    }
}