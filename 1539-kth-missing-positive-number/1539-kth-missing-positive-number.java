class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int high = n-1;
        while(left<=high){
            int mid = left+(high-left)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                left=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high+1+k;
    }
}