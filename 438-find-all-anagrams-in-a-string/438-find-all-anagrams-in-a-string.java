class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        List<Integer> list = new ArrayList<>();
        if(s==null||n==0)
            return list;
        
        int[] hash = new int[26];
        for(char c:p.toCharArray()){
            hash[c-'a']++;
        }
        
        int windStart=0;
        int windEnd=0;
        while(windEnd<n){
            // valid anagram
            if(hash[s.charAt(windEnd)-'a']>0){
                hash[s.charAt(windEnd++)-'a']--;
                if(windEnd - windStart == m){
                    list.add(windStart);
                }
            }
            // window is of size 0 
            else if(windStart == windEnd){
                windEnd++;
                windStart++;
            }
            // window size is greator than pattern, so reduce window size;
            else{
                hash[s.charAt(windStart++)-'a']++;
            }
        }
        
        return list;
    }
}