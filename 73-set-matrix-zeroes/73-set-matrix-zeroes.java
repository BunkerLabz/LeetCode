class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int[row][col];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr[i][j] = matrix[i][j];
            }
        }
        
        for(int i=0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if(arr[i][j] == 0) {
                    zeroMaker(matrix, row, col, i, j);
                }
            }
        }
    }
    void zeroMaker(int[][] matrix, int row, int col, int r, int c) {
        
        // making row elements 0
        for(int i=0; i<col; i++) {
            matrix[r][i] = 0;
        }
        
        //making column elements 0
        for(int i=0; i<row; i++) {
            matrix[i][c] = 0;
        }
    }
}