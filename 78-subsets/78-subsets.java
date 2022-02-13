class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subList = new ArrayList<>();
        solve(nums, 0, subList);
        return list;
    }
    void solve(int[] nums, int start, List<Integer> subList){
        
        // base case
        if(start == nums.length){
            list.add(new ArrayList<>(subList));
            return;
        }
        
        
        // recursion call
        int cc = nums[start];
        
        // either will take this
        subList.add(cc);
        solve(nums, start+1, subList);
        // or will skip this element
        subList.remove((Integer) cc);
        solve(nums, start+1, subList);
    }
}