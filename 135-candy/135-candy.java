class Solution {
    public int candy(int[] ratings) {
        // int n = ratings.length;
        // int candiesR[] = new int[n];
        // int candiesL[] = new int[n];
        // Arrays.fill(candiesR, 1);
        // Arrays.fill(candiesL, 1);
        // for(int i = 1; i < n; i++) {
        //     if(ratings[i] > ratings[i - 1]) {
        //         candiesL[i] += candiesL[i - 1]; 
        //     }
        // }
        // int sum = 0;
        // candiesL[n - 1] = Math.max(candiesR[n - 1], candiesL[n - 1]);
        // sum = candiesL[n - 1];
        // for(int i = n - 2; i >= 0; i--) {
        //     if(ratings[i] > ratings[i + 1]) {
        //         candiesR[i] += candiesR[i + 1]; 
        //     }
        //     candiesL[i] = Math.max(candiesL[i], candiesR[i]);
        //     sum += candiesL[i];
        // }
        
        int n = ratings.length;
        int candies[] = new int[n];
        Arrays.fill(candies, 1);
        for(int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candies[i] += candies[i - 1]; 
            }
        }
        for(int i = n - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], (candies[i + 1] + 1));
            }
        }
        int sum = 0;        
        for (int candy : candies)  
    	    sum += candy;     
        
        return sum;
    }
}