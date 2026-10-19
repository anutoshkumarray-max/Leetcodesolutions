class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        int left = nums[0];
        for(int i=1;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]>left && nums[i]>nums[i+1]){
                count++;
            }else if(nums[i]<left && nums[i]<nums[i+1]){
                count++;
            }
            left=nums[i];
        }
        return count;
    }
}