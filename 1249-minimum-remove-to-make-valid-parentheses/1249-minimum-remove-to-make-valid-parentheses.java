class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder builder = new StringBuilder();
        int open = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                open++;
            }else if(c == ')'){
                if(open == 0)
                    continue;
                open--;
            }
            
            builder.append(c);
                
        }
        
        StringBuilder result = new StringBuilder();
        for(int i=builder.length()-1;i>=0;i--){
            char c = builder.charAt(i);
            if(c == '(' && open>0){
                open--;
                continue;
            }
            
            result.append(c);
        }
        
        return result.reverse().toString();
    }
}