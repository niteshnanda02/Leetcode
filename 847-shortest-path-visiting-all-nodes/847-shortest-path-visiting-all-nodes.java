class Solution {
    public int shortestPathLength(int[][] graph) {
        Queue<int[]> queue = new LinkedList<>();
        int n = graph.length;
        int row = n;
        int col = (int) Math.pow(2,n);
        int[][] dis = new int[row][col];
        for(int[] a: dis)
            Arrays.fill(a, -1);
        for(int i=0;i<n;i++){
            int mask = setMask(0,i);
            queue.add(new int[]{i, mask});
            dis[i][mask]=0;
        }
        
        while(!queue.isEmpty()){
            int[] elem = queue.remove();
            int ver = elem[0];
            int mask = elem[1];
            if(mask == col-1){
                    return dis[ver][mask];
                }
            
            for(int child: graph[ver]){
                int newVer = child;
                int newMask = setMask(mask, newVer);
                if(dis[newVer][newMask]!=-1)
                    continue;
                dis[newVer][newMask] = dis[ver][mask]+1;
                queue.add(new int[]{newVer, newMask});
            }
            
        }
        return n;
    }
    
    int setMask(int mask,int ver){
        return mask|1<<ver;
    }
}