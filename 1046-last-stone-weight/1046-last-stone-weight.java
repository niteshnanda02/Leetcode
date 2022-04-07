class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int x: stones)
            maxHeap.add(x);
        
        while(maxHeap.size()>1){
            int first=maxHeap.poll();
            int second = maxHeap.poll();
            int diff = first-second;
            if(diff!=0)
                maxHeap.add(diff);
        }
        
        return maxHeap.isEmpty()?0:maxHeap.peek();
    }
}