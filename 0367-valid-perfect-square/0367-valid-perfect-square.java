class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left = 1;
        int right = num;
        while(left <= right){
            int mid = left + (right-left)/2;
            long square = (long) mid * mid;
            if(square==num) return true;
            if(square > num){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}