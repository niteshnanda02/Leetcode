class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        int n =s1.length(), m =s2.length();
        if(n>m)
            return false;
        int i=0;
        for(;i<n;i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        if(zero(arr))
            return true;
        
        for(;i<m;i++){
            arr[s2.charAt(i)-'a']--;
            arr[s2.charAt(i-n)-'a']++;
            if(zero(arr))
                return true;
        }
        return false;
    }
    
    boolean zero(int[] arr){
        for(int x:arr){
            if(x!=0)
                return false;
        }
        return true;
    }
}