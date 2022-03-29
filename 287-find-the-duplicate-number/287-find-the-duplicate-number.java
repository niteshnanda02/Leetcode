class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast=0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        
        int len = 1;
        while(nums[slow]!=fast){
            slow = nums[slow];
            len++;
        }
        
        slow = 0;
        fast = 0;
        
        while(len>0){
            fast=nums[fast];
            len--;
        }
        
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        
        return slow;
    }
}