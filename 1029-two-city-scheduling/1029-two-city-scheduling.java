class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<>(){
            @Override
            public int compare(int[] a, int[] b){
                return (a[0]-a[1]) - (b[0]-b[1]);
            }
        });
        
        int cost = 0, n = costs.length;
        
        for(int i=0;i<n/2;i++)
            cost+=costs[i][0];
        
        for(int i=n/2;i<n;i++)
            cost+=costs[i][1];
        
        return cost;
    }
}