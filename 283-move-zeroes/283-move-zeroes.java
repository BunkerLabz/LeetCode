class Solution {
    public void moveZeroes(int[] nums) {
        // int n = nums.length;
        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         if(nums[i] == 0 && nums[j] != 0) {
        //             nums[i] = nums[j];
        //             nums[j] = 0;
        //         }
        //         else
        //             continue;
        //     }
        // }
        int zero = 0;
        // int n  = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zero++;
            }
            else if(zero > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - zero] = t;
            }
        }
    }
}