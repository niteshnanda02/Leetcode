class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, cnt=0, prefixSum=0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int elem: nums){
            prefixSum+=elem;
            
            if(prefixSum == k){
                cnt++;
            }
            
            if(map.containsKey(prefixSum - k)){
                cnt+=map.get(prefixSum-k);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return cnt;
    }
}