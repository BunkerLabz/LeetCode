class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] < target)
                r++;
            else
                c--;
        }
        return false;
    }
}

// Approach 2 Binary Search

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int r = matrix.length, c = matrix[0].length;
//         int l = 0;
//         int h = (r * c) - 1;
//         int mid = 0;
//         while(l <= h) {
//             mid = (l + (h - l)) / 2;
//             if(matrix[mid / c][mid % c] == target) {
//                 return true;
//             }
//             else if(matrix[mid / c][mid %c] < target) {
//                 l = mid + 1;
//             }
//             else
//                 h = mid - 1;
//         }
//         return false;
//     }
// }