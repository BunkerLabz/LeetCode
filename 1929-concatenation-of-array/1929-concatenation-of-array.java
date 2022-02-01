class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[2*nums.length];
        int j = 0;
        for(int i = 0; i < 2*nums.length; i++) {
            
            if(j<nums.length) {
                arr[i] = nums[j];  
                j++;
            }
            
            else {
                j = 0;
                arr[i] = nums[j];
                j++;
            }
            
        }
        return arr;
    }
    
}