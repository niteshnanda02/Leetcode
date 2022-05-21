class Solution {
    int[][] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length+1][amount+1];
        for(int[] a: dp)
            Arrays.fill(a,-1);
        int ans= solve(coins, amount, coins.length);
        if(ans == (int)Math.pow(10,9))
            return -1;
        return ans;
    }
    
    int solve(int[] arr, int amount, int n){
        if(n==0 || amount==0){
            return amount ==0?0:(int)Math.pow(10,9);
        }
        if(dp[n][amount]!=-1)
            return dp[n][amount];
        if(arr[n-1]<=amount){
            return dp[n][amount]=Math.min(solve(arr, amount-arr[n-1], n)+1, solve(arr, amount, n-1));
        }else{
            return dp[n][amount]=solve(arr, amount,n-1);
        }
    }
}