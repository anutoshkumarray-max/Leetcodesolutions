class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int count = 0;
        int longest = 1;
        int last = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]-1 == last){
                count=count+1;
                last=nums[i];
            }else if(last!=nums[i]){
                count=1;
                last=nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}