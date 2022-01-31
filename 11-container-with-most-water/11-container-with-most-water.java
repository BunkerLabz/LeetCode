class Solution {
    public int maxArea(int[] arr) {
        int max = 0, greater = 0, i = 0, j = arr.length - 1; 
        while(i < j) {
            if(arr[i] < arr[j]) {
                max = arr[i] * (j - i);
            }
            else {
                max = arr[j] * (j - i);
            }
            if(max > greater)
                greater = max;
            
            if(arr[i] <= arr[j])
                i++;
            else
                j-- ;
        }
        return greater;
    }
}
