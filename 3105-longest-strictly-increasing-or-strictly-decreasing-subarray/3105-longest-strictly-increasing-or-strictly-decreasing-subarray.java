class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int count1 = 1;
        int count2 = 1;
        int ans = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count1++;
            } else {
                count1 = 1;
            }
            if (nums[i] > nums[i + 1]) {
                count2++;
            } else {
                count2 = 1;
            }
            ans = Math.max(ans, Math.max(count1, count2));
        }
        return ans;
    }
}