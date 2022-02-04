class Solution {
    public void moveZeroes(int[] nums) {        
        int zero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zero++;
            }
            else if(zero > 0) {
                nums[i - zero] = nums[i];
                nums[i] = 0;
                
            }
        }
    }
}