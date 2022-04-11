class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length, col = grid[0].length;
        k%=(row*col);
        int[][] ans = new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int nrow=i, ncol=j+k;
                if(ncol>=col){
                    nrow+=ncol/col;
                    
                    if(nrow>=row)
                        nrow%=row;
                    
                    ncol%=col;
                }
            
                ans[nrow][ncol]=grid[i][j];
            }
        }
        
        return (List) Arrays.asList(ans);
    }
}