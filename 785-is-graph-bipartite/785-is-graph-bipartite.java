class Solution {
    boolean[] vis;
    int[] col;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        vis = new boolean[n];
        col = new int[n];
        
        for(int i=0;i<n;i++){
            if(!vis[i] && !bipartite(graph,i,0)){
                return false;
            }
        }
        
        return true;
    }
    
    boolean bipartite(int[][] graph, int vertex, int colour){
        vis[vertex]=true;
        col[vertex]=colour;
        
        for(int child:graph[vertex]){
            if(!vis[child]){
                if(!bipartite(graph, child, colour^1))
                    return false;
            }else{
                if(col[vertex]==col[child])
                    return false;
            }
        }
        return true;
    }
}