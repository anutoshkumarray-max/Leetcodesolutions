class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int m = quantities.length;
        int low = 1;
        int high = 100000;
        int ans = -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(mid,n,quantities)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int x, int n, int[] arr) {
        int nn = 0;
        for (int i = 0; i < arr.length; i++) {
            nn += Math.ceil((double) arr[i] / x);
            if (nn > n) {
                return false;
            }
        }
        return nn <= n;
    }
}