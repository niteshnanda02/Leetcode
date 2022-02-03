class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int cnt =0;
        Map<Integer,Integer> map = new HashMap<>();
        // map
        for(int c: nums3){
            for(int d: nums4){
                int sum = c+d;
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        // check the sum
        for(int a: nums1){
            for(int b: nums2){
                int sum = a+b;
                sum*=-1;
                cnt+=map.getOrDefault(sum,0);
            }
        }
        return cnt;
    }
}