class Solution {
    List<String> list;
    char[] arr = {'a', 'e','i','o','u'};
    public int countVowelStrings(int n) {
        list = new ArrayList<>();
        solve(n, 0, new StringBuilder());
        return list.size();
    }
    
    void solve(int n, int start, StringBuilder builder){
        
        if(n==0){
            list.add(builder.toString());
            return;
        }
        
        for(int i=start; i<5;i++){
            builder.append(arr[i]);
            solve(n-1, i, builder);
            builder.deleteCharAt(builder.length()-1);
        }
    }
}