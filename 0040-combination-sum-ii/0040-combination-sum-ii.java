class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0,candidates,target,list,ans);
        return ans;
    }
    public void solve(int ind,int[] candidates,int target,List<Integer> list,List<List<Integer>> ans){
        int n = candidates.length;
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if (ind == candidates.length || candidates[ind] > target) {
            return;
        }
        list.add(candidates[ind]);
        solve(ind+1,candidates,target-candidates[ind],list,ans);
        list.remove(list.size()-1);
        for(int j=ind+1;j<candidates.length;j++){
            if(candidates[j]!=candidates[ind]){
                solve(j,candidates,target,list,ans);
                break;
            }
        }
    }
}