class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m+1][n+1][strs.length];
        return solve(strs, m, n ,0);
    }
    
    int solve(String[] strs, int m, int n, int ind){
        
        if(ind == strs.length || m+n==0)
            return 0;
        if(dp[m][n][ind]>0)
            return dp[m][n][ind];
        int zero = cntZ(strs[ind]);
        int one = strs[ind].length()-zero;
        
        int accept = 0, skip = 0;
        if(m>=zero && n>=one)
            accept = solve(strs, m-zero, n-one, ind+1)+1;
        
        skip = solve(strs, m, n, ind+1);
        return dp[m][n][ind]=Math.max(accept, skip);
    }
    
    int cntZ(String s){
        int z=0;
        for(char c: s.toCharArray()){
            if(c=='0')
                z++;
        }
        return z;
    }
}