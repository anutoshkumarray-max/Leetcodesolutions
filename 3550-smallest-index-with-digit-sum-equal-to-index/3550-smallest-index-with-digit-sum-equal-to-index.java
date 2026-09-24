class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                if(nums[i]==i){
                    return i;
                }
            }else{
                int num = nums[i];
                int sum = 0;
                while(num > 0){
                    sum+=num%10;
                    num=num/10;
                }
                if(sum==i){
                    return i;
                }
            }
        }
        return -1;
    }
}