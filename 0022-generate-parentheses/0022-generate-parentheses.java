class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(0,0,n,"",result);
        return result;
    }
    private void backtrack(int open,int close,int n,String s,List<String> result){
        if(open==close && open+close==2*n){
            result.add(s);
            return;
        }
        if(open<n){
            backtrack(open+1,close,n,s+'(',result);
        }
        if(close<open){
            backtrack(open,close+1,n,s+')',result);
        }
    }
}