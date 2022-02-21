class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0, cnt =0;
        for(int x: nums){
            if(cnt == 0){
                maj = x;
                cnt = 1;
            }else{
                if(maj == x)
                    cnt++;
                else
                    cnt--;
            }
        }
        
        return maj;
    }
}