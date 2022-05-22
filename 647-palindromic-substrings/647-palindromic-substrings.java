class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                char ci = s.charAt(i), cj = s.charAt(j);
                if(i==j){
                    if(ci==cj)
                        dp[i][j]=1;
                }else if(j-i==1){
                    if(ci == cj)
                        dp[i][j]=1;
                }else{
                    if(ci==cj && i+1<n && j-1>=0 && dp[i+1][j-1]==1)
                        dp[i][j]=1;
                }
            }
        }
        
        int sum=0;
        for(int[] a: dp){
            sum+=Arrays.stream(a).sum();
        }
        return sum;
    }
}