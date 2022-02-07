class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        char ans = '\0';
        for(char c:s.toCharArray())
            arr[c-'a']++;
        for(char c:t.toCharArray()){
            if(arr[c-'a']<1){
                ans = c;
                break;
            }
            arr[c-'a']--;
        }
        return ans;
    }
}