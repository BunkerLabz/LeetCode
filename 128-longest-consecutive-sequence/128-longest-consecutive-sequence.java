class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(!hashSet.contains(nums[i] - 1)) {
                int temp = 1;
                int num = nums[i];
                
                while(hashSet.contains(num + 1)) {
                    num++;
                    temp++;
                }
                count = Math.max(temp, count);
            }
        }
        return count;
    }
}