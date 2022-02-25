class Solution {
    public int maximumGap(int[] arr) {
        if(arr.length < 2)
            return 0;
        Arrays.sort(arr);
        int n = arr.length;
        int gap = 0;
        for(int i = 0; i < n - 1; i++) {
            int x = arr[i + 1] - arr[i];
            if(x > gap)
                gap = x;
        }
        return gap;
    }
}