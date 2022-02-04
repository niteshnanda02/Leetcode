class Solution {
    public int findMaxLength(int[] nums) {
        int max =0;
        int n =nums.length;
        Map<Integer,Integer> map =new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=(nums[i]==0)?-1:1;
            // sum is zero
            if(sum == 0){
                max = Math.max(max,i+1);
            }else{
                if(map.containsKey(sum))
                    max = Math.max(max, i-map.get(sum));
                else
                    map.put(sum,i);
            }
        }
        return max;
    }
}