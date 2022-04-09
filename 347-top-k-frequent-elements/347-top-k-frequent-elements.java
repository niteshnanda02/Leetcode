class Solution {
    class Node implements Comparable<Node> {
        int data, freq;
        Node(int d, int f){
            data=d;
            freq=f;
        }
        @Override
        public int compareTo(Node node){
            return node.freq-this.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x:nums)
            map.put(x, map.getOrDefault(x, 0) +1);
        
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }
        
        int[] ans= new int[k];
        for(int i=0;i<k;i++)
            ans[i]=queue.poll().data;
        
        return ans;
    }
}