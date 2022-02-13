class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        list.clear();
        List<Integer> subList= new ArrayList<>();
        solve(nums,0, subList);
        return list;
    }
    
    void solve(int[] nums,int start,List<Integer> subList){
        if(start == nums.length){
            list.add(new ArrayList<>(subList));
            return;
        }
        int cc = nums[start];
        subList.add(cc);
        solve(nums, start+1, subList);
        subList.remove((Integer) cc);
        solve(nums, start+1, subList);
    }
}