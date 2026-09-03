class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int n = nums.length;
        int longest = 1;
        int currcount = 1;
        int lastsmaller = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-1==lastsmaller){
                currcount=currcount+1;
                lastsmaller=nums[i];
            }else if(lastsmaller!=nums[i]){
                currcount=1;
                lastsmaller=nums[i];
            }
            longest = Math.max(longest,currcount);
        }
        return longest;
    }
}