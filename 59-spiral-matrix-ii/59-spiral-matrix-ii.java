class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        // pointer for start col
        int l=0;
        // pointer for end col
        int r=n-1;
        // pointer for start row
        int t=0;
        // pointer for end row
        int b=n-1;
        
        int c=1;
        
        while(l<=r&&t<=b){
            for(int i=l;i<=r;i++){
                arr[t][i]=c;
                c++;
            }
            t++;
            
            for(int i=t;i<=b;i++){
                arr[i][r]=c;
                c++;
            }
            r--;
            
            for(int i=r;i>=l;i--){
                arr[b][i]=c;
                c++;
            }
            b--;
            
            for(int i=b;i>=t;i--){
                arr[i][l]=c;
                c++;
            }
            l++;
        }
        
        return arr;
    }
}