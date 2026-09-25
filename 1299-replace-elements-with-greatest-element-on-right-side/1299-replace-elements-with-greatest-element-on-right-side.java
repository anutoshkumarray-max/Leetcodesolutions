class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int largest = arr[n - 1];
        ans[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            ans[i] = largest;
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return ans;
    }
}