class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subList = new ArrayList<>();
        solve(candidates, 0, target, subList);
        return list;
    }
    
    void solve(int[] nums, int start, int target, List<Integer> subList){
        
        if(target<0)
            return;
        
        if(target == 0){
            list.add(new ArrayList<>(subList));
            return;
        }
        
        for(int i=start;i<nums.length;i++){
            if(nums[i]>target)
                continue;
            subList.add(nums[i]);
            solve(nums, i, target-nums[i], subList);
            subList.remove(subList.size()-1);
        }
    }
}