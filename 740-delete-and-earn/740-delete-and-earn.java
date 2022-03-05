class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int e: nums)
            max = Math.max(e, max);
        
        int[] arr = new int[max+1];
        for(int e: nums)
            arr[e]++;
        
        int[] dp = new int[max+1];
        Arrays.fill(dp, -1);
        
        return solve(arr, arr.length-1, dp);
    }
    
    int solve(int[] arr, int n, int[] dp){
        if(n<0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=Math.max(n*arr[n]+solve(arr,n-2, dp), solve(arr, n-1, dp));
    }
}