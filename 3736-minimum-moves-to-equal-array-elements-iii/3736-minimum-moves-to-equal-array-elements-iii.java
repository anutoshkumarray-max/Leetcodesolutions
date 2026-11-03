class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        int n = nums.length;
        int value = nums[n-1];
        for(int i=0;i<n;i++){
            moves+=Math.abs(nums[i]-value);
        }
        return moves;
    }
}