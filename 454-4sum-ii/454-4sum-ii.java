class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:nums1){
            for(int b:nums2){
                int sum = a+b;
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        
       for(int c:nums3){
            for(int d:nums4){
                int sum = c+d;
                sum*=-1;
                res+=map.getOrDefault(sum,0);
            }
        }

        return res;
    }
}