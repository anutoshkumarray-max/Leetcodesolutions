class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            int val = sum-k;
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}