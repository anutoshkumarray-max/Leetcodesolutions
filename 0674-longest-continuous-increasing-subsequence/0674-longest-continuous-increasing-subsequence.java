class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int left = 0;
        int maxlen = 1;
        for(int right = 1;right<n;right++){
            if(nums[right-1]>=nums[right]){
                left = right;
            }else{
                maxlen = Math.max(right-left+1,maxlen);
            }
        }
        return maxlen;
    }
}