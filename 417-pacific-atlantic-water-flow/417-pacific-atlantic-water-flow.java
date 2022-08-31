class Solution {
    boolean[][] pacific;
    boolean[][] atlantic;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        if(m == 0 || n == 0) return result;
        //base case
        pacific = new boolean[m][n];
        atlantic = new boolean[m][n];
        
        //For each row: we flood left to right & right to left
        for(int i = 0; i<m; i++){
            flood(i, 0, heights, heights[i][0], pacific);
            flood(i, n-1, heights, heights[i][n-1], atlantic);
        }
        
        //For each column: we flood up to down & down to up
        for(int i = 0; i < n; i++){
            flood(0, i, heights, heights[0][i], pacific);
            flood(m-1, i, heights, heights[m-1][i], atlantic);
        }
        //record the indices when both true.
        for(int i = 0; i<m;i++){
            for(int j = 0; j < n; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }
        return result;
    }
    private void flood(int i, int j, int[][] heights, int preHeight, boolean[][] ocean){
        //We do not operate when:
        //1. out of bound
        //2. the preHeight is higher, that is no flooding from this to previous
        //3. already flooded
        if(i<0 || j<0 || i>=heights.length || j>=heights[0].length || preHeight > heights[i][j] || ocean[i][j]) return;
        //this place is true when:
        //1. adjacent to either pacific or atlantic
        //2. higher or equal than the previous place so that can flood from this to previous
        ocean[i][j] = true;
        flood(i+1, j, heights, heights[i][j], ocean);
        flood(i, j+1, heights, heights[i][j], ocean);
        flood(i-1, j, heights, heights[i][j], ocean);
        flood(i, j-1, heights, heights[i][j], ocean);
    }
}