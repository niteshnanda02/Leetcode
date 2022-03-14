class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        
        for(String s: arr){
            // s == ".."
            if(!stack.isEmpty() && s.equals(".."))
                stack.pop();
            else if(!s.equals(".")&&!s.equals("..")&&!s.equals(""))
                stack.push(s);
        }
        
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()){
            builder.insert(0, stack.pop());
            builder.insert(0, "/");
        }
        
        
        if(builder.isEmpty())
            builder.append("/");
        
        return builder.toString();
    }
}