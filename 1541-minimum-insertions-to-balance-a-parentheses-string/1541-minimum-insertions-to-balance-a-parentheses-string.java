class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int open = 0;
        int closed = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
            }else{
                if(i+1 < s.length() && s.charAt(i+1)==')'){
                    i++;
                }else{
                    closed++;
                }
                if(open > 0){
                    open--;
                }else{
                    closed++;
                }
            }
        }
        closed += open * 2;
        return closed;
    }
}