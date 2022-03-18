class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        boolean[] vis = new boolean[26];
        int[] cnt = new int[26];
        
        // create a map
        for(char c: s.toCharArray()){
            cnt[c-'a']++;
        }
        
        
        for(char c: s.toCharArray()){
            cnt[c-'a']--;
            // if char is already vis
            if(vis[c-'a'])
                continue;
            
            // one condition
            while(!stack.isEmpty() && c<stack.peek() && cnt[stack.peek()-'a']>0){
                vis[stack.pop()-'a']=false;
            }
            
            stack.push(c);
            vis[c-'a']=true;
        }
        
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()){
            builder.insert(0, stack.pop());
        }
        
        return builder.toString();
    }
}