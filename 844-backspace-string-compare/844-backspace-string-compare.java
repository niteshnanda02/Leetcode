class Solution {
    public boolean backspaceCompare(String s, String t) {
        int skipS=0, skipT=0;
        int i=s.length()-1, j=t.length()-1;
        while(i>=0||j>=0){
            //s string
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skipS++;
                    i--;
                }else if(skipS>0){
                    skipS--;
                    i--;
                }else{
                    break;
                }
            }
            
            // t string
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipT++;
                    j--;
                }else if(skipT>0){
                    skipT--;
                    j--;
                }else{
                    break;
                }
            }
            
            if(i>=0&&j>=0&&s.charAt(i)!=t.charAt(j))
                return false;
            else if((i>=0)!=(j>=0))
                return false;
            
            i--;
            j--;
        }
        return true;
    }
}