class Solution {
    public double findMedianSortedArrays(int[] arr, int[] brr) {
        int m = arr.length;
        int n = brr.length;
        int array[] = Arrays.copyOf(arr, m + n);
        for(int i = 0; i < n; i++) {
            array[m + i] = brr[i];
        }
        Arrays.sort(array);
        if(array.length % 2 == 0) {
            return (float)(array[(m + n) / 2 - 1] + array[(m + n) / 2]) / 2;
        }
        else
            return (float)array[(m + n) / 2];
    }
}