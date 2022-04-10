class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int ans=0;
        for(String s: ops){
            if(s.equals("C")){
                int rv=stack.pop();
                ans-=rv;
            }else if(s.equals("D")){
                int temp = stack.peek()*2;
                stack.push(temp);
                ans+=temp;
            }else if(s.equals("+")){
                int temp1=stack.pop();
                int temp2=stack.pop();
                int sum=temp1+temp2;
                stack.push(temp2);
                stack.push(temp1);
                stack.push(sum);
                ans+=sum;
            }else{
                int val = Integer.parseInt(s);
                stack.push(val);
                ans+=val;
            }
        }
        
        return ans;
    }
}