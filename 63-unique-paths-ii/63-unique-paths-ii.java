class Solution {
    
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        dp = new int[m][n];
        for(int[] a: dp)
            Arrays.fill(a, -1);
        return solve(obstacleGrid, 0 , 0, m, n);
    }
    
    int solve(int[][] arr, int row, int col, int m,int n){
        
        // base case
        if(row>=m || col>=n || arr[row][col]==1)
            return 0;
        if(row == m-1 && col == n-1)
            return 1;
        if(dp[row][col]!=-1)
            return dp[row][col];
        
        return dp[row][col]=solve(arr, row, col+1, m, n) + solve(arr, row+1, col, m, n);
    }
}