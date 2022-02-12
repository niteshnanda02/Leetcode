class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        
        if(!set.contains(endWord))
            return 0;
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        
        int changes = 1;
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            for(int i=0;i<size;i++){
                String curr = queue.poll();
                if(curr.equals(endWord))
                    return changes;
                
                for(int j=0;j<curr.length();j++){
                    char[] arr = curr.toCharArray();
                    for(char k='a';k<='z';k++){
                        arr[j] = k;
                        String str = new String(arr);
                        
                        if(set.contains(str)&&!visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }

                    }
                }
            }
            changes++;
        }
        return 0;

    }
}