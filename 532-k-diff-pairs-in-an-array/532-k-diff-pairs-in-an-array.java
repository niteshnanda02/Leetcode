class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        
        // nums array into the map
        for(int c:nums){
            map.put(c,map.getOrDefault(c, 0) + 1);
        }
        
        
        // find out the pair
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(k == 0){
                if(entry.getValue()>1)
                    cnt++;
            }else{
                int num = entry.getKey() + k;
                if(map.containsKey(num))
                    cnt++;
            }
        }
        
        
        return cnt;
    }
}