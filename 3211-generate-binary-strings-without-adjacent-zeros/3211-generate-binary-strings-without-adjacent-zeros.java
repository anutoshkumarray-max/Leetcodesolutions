class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        solve(n,"",ans);
        return ans;
    }
    public void solve(int n,String s,List<String> ans){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        solve(n,s+'1',ans);
        if(s.length()==0 || s.charAt(s.length()-1)!='0'){
            solve(n,s+'0',ans);
        }
    }
}