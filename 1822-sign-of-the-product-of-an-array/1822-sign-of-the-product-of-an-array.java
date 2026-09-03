class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int negativecount = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                negativecount++;
            }
        }
        if(negativecount%2==0){
            return 1;
        }
        return -1;
    }
}