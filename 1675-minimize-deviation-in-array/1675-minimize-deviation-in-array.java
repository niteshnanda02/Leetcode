class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int e: nums){
            if(e%2!=0)
                e=e*2;
            set.add(e);
        }
        
        int dev = Integer.MAX_VALUE;
        while(!set.isEmpty()){
            int first = set.first();
            int last = set.last();
            dev = Math.min(dev, last-first);
            if(last%2==0){
                set.remove(last);
                set.add(last/2);
            }else{
                break;
            }
        }
        
        return dev;
    }
}