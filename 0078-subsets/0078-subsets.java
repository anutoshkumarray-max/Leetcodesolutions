class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        solve(0,nums,ans,list);
        return list;
    }
    private void solve(int ind,int[] nums,List<Integer> ans,List<List<Integer>> list){
        if(ind==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[ind]);
        solve(ind+1,nums,ans,list);
        ans.remove(ans.size()-1);
        solve(ind+1,nums,ans,list);
    }
}