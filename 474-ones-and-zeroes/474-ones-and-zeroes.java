class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m+1][n+1][strs.length];
        int[][] cnt = new int[strs.length][2];
        int i=0;
        for(String s: strs){
            int zero = cntZ(s);
            int one = s.length()-zero;
            cnt[i][0]=zero;
            cnt[i][1]=one;
            i++;
        }
        return solve(cnt, m, n ,0);
    }
    
    int solve(int[][] cnt, int m, int n, int ind){
        
        if(ind == cnt.length || m+n==0)
            return 0;
        if(dp[m][n][ind]>0)
            return dp[m][n][ind];
        
        int accept = 0, skip = 0;
        if(m>=cnt[ind][0] && n>=cnt[ind][1])
            accept = solve(cnt, m-cnt[ind][0], n-cnt[ind][1], ind+1)+1;
        
        skip = solve(cnt, m, n, ind+1);
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