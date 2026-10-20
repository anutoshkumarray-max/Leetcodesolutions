class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int n = nums.length;
        int low = 0;
        int high = maximum(nums);
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            int result = sum(nums,mid);
            if(result<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int maximum(int[] nums){
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
    public int sum(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/mid);
        }
        return sum;
    }
}