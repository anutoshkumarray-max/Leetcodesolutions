class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        int prevdiff = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int currdiff = Math.abs(target-sum);
                if(currdiff<prevdiff){
                    prevdiff=currdiff;
                    ans=sum;
                }
                if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }
}