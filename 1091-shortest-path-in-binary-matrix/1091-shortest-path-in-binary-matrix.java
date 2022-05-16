class Solution {
    int[][] dir = {{0, 1}, {1, 1}, {1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0)
            return -1;
        int res = 1;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];
        
        queue.add(new int[]{0,0});
        vis[0][0]=true;
        while(!queue.isEmpty()){
            for(int i=queue.size()-1;i>=0;i--){
                int[] pop = queue.remove();
                int x = pop[0], y =pop[1];
                if(x == n-1 && y == n-1)
                    return res;
                
                // all 8 direction
                for(int k=0;k<8;k++){
                    int newx = x + dir[k][0];
                    int newy = y + dir[k][1];
                    
                    if(newx>=0 && newx<n && newy>=0 && newy<n && !vis[newx][newy] && grid[newx][newy]==0){
                        queue.add(new int[]{newx, newy});
                        vis[newx][newy]=true;
                    }
                }
            }
            res++;
        }
        
        return -1;
    }
}