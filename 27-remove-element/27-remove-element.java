class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val && count == 0) {
				continue;
			}
			else if(nums[i] == val) {
				count++;
			}
			else if(nums[i] != val && count > 0) {
				nums[i - count] = nums[i];
				nums[i] = val;
			}
		}
        return nums.length - count;
    }
}