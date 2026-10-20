class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int n = nums.length;
       int low = 1;
       int high = findmaximum(nums);
       int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(sum(nums,mid)<=limit){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int findmaximum(int[] nums){
        int maxi = -1;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
    public int sum(int[] nums, int divisor){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / divisor);
        }
        return sum;
    }
}