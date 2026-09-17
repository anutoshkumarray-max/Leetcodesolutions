class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int minimum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            minimum = Math.min(minimum,sum);
        }
        return 1 - minimum;
    }
}