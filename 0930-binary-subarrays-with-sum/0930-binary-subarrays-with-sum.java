class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        int sum = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int val = sum - goal;
            if(map.containsKey(val)){
                ans+=map.get(val);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}