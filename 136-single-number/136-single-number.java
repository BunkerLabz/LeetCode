class Solution {
    public int singleNumber(int[] nums) {
        
        Set<Integer> hashSet = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            if(hashSet.contains(nums[i])) {
                hashSet.remove(nums[i]);
            }
            
            else {
                hashSet.add(nums[i]);
            }
            
        }
        nums = new int[1];
        nums = hashSet.stream().mapToInt(Integer::intValue).toArray();
        return nums[0];
    
    }
}