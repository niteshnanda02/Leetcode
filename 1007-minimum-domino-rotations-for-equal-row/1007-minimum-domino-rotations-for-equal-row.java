class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] t = new int[7], b= new int[7], same = new int[7];
        int n = tops.length;
        // cnt array
        for(int i=0;i<n;i++){
            t[tops[i]]++;
            b[bottoms[i]]++;
            
            if(tops[i] == bottoms[i])
                same[tops[i]]++;
        }
        
        for(int i=1;i<=6;i++){
            if(t[i]+b[i]-same[i] == n)
                return n - Math.max(t[i], b[i]);
        }
        
        return -1;
    }
}