class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[query_row+1][query_glass+2];
        dp[0][0] = poured;
        
        for(int row = 0;row<query_row;row++){
            for(int col = 0; col<=query_glass; col++){
                double rest = Math.max(dp[row][col]-1,0);
                dp[row+1][col] += rest/2.0;
                dp[row+1][col+1] += rest/2.0;
            }
        }
        
        return Math.min(dp[query_row][query_glass], 1);
    }
}