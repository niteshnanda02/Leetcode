class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int c=0;
        
        for(int x: nums){
            // x+res=k; res=k-x;
            int res = k-x;
            if(map.containsKey(res)){
                c++;
                if(map.get(res)==1)
                    map.remove(res);
                else
                    map.put(res, map.get(res)-1);
            }else{
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        
        return c;
    }
}