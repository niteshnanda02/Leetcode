class Solution {
    class Node{
        char data;
        int index;
        Node(char a, int b){
            data=a;
            index=b;
        }
        
    }
    public String removeDuplicates(String s, int k) {
        Stack<Node> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().data == c){
                Node rv = stack.pop();
                rv.index+=1;
                stack.push(rv);
            }else{
                stack.push(new Node(c, 1));
            }
            
            if(!stack.isEmpty() && stack.peek().index == k)
                stack.pop();
        }
        
        StringBuilder builder=new StringBuilder();
        while(!stack.isEmpty()){
            Node rv = stack.pop();
            int ind = rv.index;
            while(ind-->0){
                builder.append(rv.data);
            }
        }
        return builder.reverse().toString();
    }
}