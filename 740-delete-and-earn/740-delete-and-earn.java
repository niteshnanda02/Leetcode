class Solution {
    int[] dp = new int[10001];
    public int deleteAndEarn(int[] nums) {
        
        int[] arr = new int[10001];
        Arrays.fill(dp, -1);
        for(int x:nums){
            arr[x]++;
        }
        return solve(arr, arr.length-1);
    }
    int solve(int[] arr, int n){
        if(n<0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=Math.max(arr[n]*n+solve(arr, n-2), solve(arr, n-1));
    }
}