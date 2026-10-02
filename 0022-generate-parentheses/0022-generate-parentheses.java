class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ds = new ArrayList<>();
        generate("",0,0,ds,n);
        return ds;
    }
    public void generate(String s,int open,int close,List<String> ds,int n){
        if(s.length()==2*n){
            ds.add(s);
            return;
        }
        if(open<n){
            generate(s+'(',open+1,close,ds,n);
        }
        if(close<open){
            generate(s+')',open,close+1,ds,n);
        }
    }
}