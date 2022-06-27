class Solution {
    public int[] minOperations(String boxes) {
        int count = 0;
        int n = boxes.length();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j || boxes.charAt(j) == '0') {
					continue;
				}
				else
					count = count + Math.abs(i - j);
			}
			nums[i] = count;
			count = 0;
		}
        return nums;
    }
}