class Solution {
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        int n = nums.length;
        long[] leftMax = new long[n];
        long[] rightMax = new long[n];
        leftMax[0] = nums[0];
        rightMax[n-1] = nums[n-1];
        for(int j=1;j<n;j++){
            leftMax[j] = Math.max(leftMax[j-1],nums[j]);
        }
        for(int j=n-2;j>=0;j--){
            rightMax[j] = Math.max(rightMax[j+1],nums[j]);
        }
        for(int j=1;j<n-1;j++){
            result = Math.max(result,(leftMax[j-1]-nums[j])*rightMax[j+1]);
        }
        return result;
    }
}