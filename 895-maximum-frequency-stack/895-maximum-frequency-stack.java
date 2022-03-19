class FreqStack {
    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> freqStack;
    int maxFreq;
    public FreqStack() {
        freq = new HashMap<>();
        freqStack = new HashMap<>();
    }
    
    public void push(int val) {
        freq.put(val, freq.getOrDefault(val, 0) + 1);
        int currFreq = freq.get(val); 
        maxFreq = Math.max(maxFreq, currFreq);
        
        Stack<Integer> stack = freqStack.getOrDefault(currFreq, new Stack<>());
        stack.push(val);
        freqStack.put(currFreq, stack);
    }
    
    public int pop() {
        
        int elem = freqStack.get(maxFreq).pop();
        int currFreq = freq.get(elem) - 1;
        freq.put(elem, currFreq);
        
        if(freqStack.get(maxFreq).isEmpty())
            maxFreq--;
        
        
        return elem;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */