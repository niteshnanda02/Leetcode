class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1,prev=nums[0],cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == prev){
                cnt++;
                if(cnt<=2){
                    nums[index] = nums[i];
                    index++;
                }
            }
            // elem are not same
            else{
                nums[index] = nums[i];
                index++;
                prev = nums[i];
                cnt = 1;
            }
        }
        
        return index;
    }
}