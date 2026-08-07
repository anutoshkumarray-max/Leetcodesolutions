class Solution {
    public int maximumCount(int[] nums) {
        int positivecount = 0;
        int negativecount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            if(nums[i]>0){
                positivecount++;
            }
            if(nums[i]<0){
                negativecount++;
            }
        }
        int ans = Math.max(positivecount,negativecount);
        return ans;
    }
}