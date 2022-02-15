class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(nums.contains(arr[i]))
                return true;
            else
                nums.add(arr[i]);
        }
        return false;
    }
}