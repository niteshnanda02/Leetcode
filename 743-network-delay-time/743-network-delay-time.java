class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> adj = new HashMap<>();
        for(int[] time: times){
            adj.putIfAbsent(time[0], new HashMap<>());
            adj.get(time[0]).put(time[1], time[2]);
        }
        
        
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[1]-b[1];
            }
        });
        queue.add(new int[]{k, 0});
        boolean[] vis = new boolean[n+1];
        int res=0;
        
        while(!queue.isEmpty()){
            int[] rv = queue.remove();
            int currNode = rv[0];
            int time = rv[1];
            if(vis[currNode])
                continue;
            vis[currNode]=true;
            res = time;
            n--;
            if(n==0)
                break;
            if(adj.containsKey(currNode)){
                for(int child: adj.get(currNode).keySet()){
                    queue.add(new int[]{child, time+ adj.get(currNode).get(child)});
                }
            }
        }
        
        return n==0?res: -1;
    }
}