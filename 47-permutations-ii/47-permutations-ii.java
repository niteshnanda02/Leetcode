class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> permuteUnique(int[] nums) {
        list = new ArrayList<>();
        solve(nums, 0);
        return list;
    }
    
    void solve(int[] nums, int l){
        if(l == nums.length){
            List<Integer> sub = new ArrayList<>();
            for(int x:nums) sub.add(x);
            list.add(sub);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=l;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                swap(nums, i, l);
                solve(nums, l+1);
                swap(nums, i, l);
            }
        }
    }
    
    void swap(int[] nums, int s, int e){
        int t=nums[s];
        nums[s]=nums[e];
        nums[e]=t;
    }
}
