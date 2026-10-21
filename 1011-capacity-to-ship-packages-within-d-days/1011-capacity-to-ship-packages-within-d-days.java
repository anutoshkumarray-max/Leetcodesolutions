class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = max(weights);
        int high = sum(weights);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int noofdays=func(weights,mid);
            if(noofdays<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int func(int[] arr,int x){
        int day=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>x){
                day=day+1;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return day;
    }
    public int max(int[] arr) {
    int maxi = arr[0];
    for (int i = 0; i < arr.length; i++) {
        maxi = Math.max(maxi, arr[i]);
    }
    return maxi;
    }
    public int sum(int[] arr) {
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        return sum;
    }
}