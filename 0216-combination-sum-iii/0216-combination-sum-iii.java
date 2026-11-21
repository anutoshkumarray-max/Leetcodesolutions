class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(1,n,k,list,ans);
        return ans;
    }
    private void solve(int start,int remaining,int k,List<Integer> list,List<List<Integer>> ans){
        if(list.size()==k && remaining==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(list.size()==k && remaining < 0){
            return;
        }
        for(int i=start;i<=9;i++){
            if(i>remaining){
                break;
            }
            list.add(i);
            solve(i+1,remaining-i,k,list,ans);
            list.remove(list.size()-1);
        }
    }
}