class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-1;
        while(low<high){
            int mid = low + (high-low)/2;
            int count = 0;
            for(int i:nums){
                if(i<=mid){
                    count++;
                }
            }
            if(count>mid){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}