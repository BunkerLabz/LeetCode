class Solution {
    public int[] minOperations(String boxes) {
        int count = 0;
        int nums[] = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++) {
			for(int j = 0; j < boxes.length(); j++) {
				if(i == j) {
					continue;
				}
				else if(boxes.charAt(j) == '0') {
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