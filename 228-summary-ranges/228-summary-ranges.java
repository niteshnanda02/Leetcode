class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            int j=i;
            while(j+1<n&&nums[j]+1 == nums[j+1]){
                j++;
            }
            
            if(j>i){
                list.add(nums[i]+"->"+nums[j]);
            }else{
                list.add(nums[i]+"");
            }
            i=j;
        }
        return list;
    }
}