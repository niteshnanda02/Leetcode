class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, cnt=0;
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            if(currSum == k)
                cnt++;
            if(map.containsKey(currSum-k))
                cnt+=map.get(currSum-k);
            
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        return cnt;
    }
}