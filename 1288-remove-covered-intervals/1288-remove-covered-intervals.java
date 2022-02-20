class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<>(){
            @Override
            public int compare(int[] a1,int[] a2){
                if(a1[0]==a2[0])
                    return a2[1]-a1[1];
                return a1[0]-a2[0];
            }
        });
        
        int[] temp = intervals[0];
        int c=1;
        for(int i=1;i<intervals.length;i++){
            if(temp[1]>=intervals[i][1]){
                continue;
            }else{
                temp=intervals[i];
                c++;            
            }
        }
        return c;
    }
}