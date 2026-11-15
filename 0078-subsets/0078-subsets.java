class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        return subsequences(0,n,list,ans,nums);
    }
    public List<List<Integer>> subsequences(int i,int n,ArrayList<Integer> list,List<List<Integer>> ans,int[] nums){
        if(i>=n){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(nums[i]);
        subsequences(i+1,n,list,ans,nums);
        list.remove(list.size()-1);
        subsequences(i+1,n,list,ans,nums);

        return ans;
    }

}