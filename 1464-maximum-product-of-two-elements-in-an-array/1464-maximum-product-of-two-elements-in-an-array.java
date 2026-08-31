class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int firstlargest = nums[n-1]-1;
        int secondlargest = nums[n-2]-1;
        return firstlargest*secondlargest;
    }
}