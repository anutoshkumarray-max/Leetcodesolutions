class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                if(k == 0 || arr[k-1] != nums1[i]) {
                    arr[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] result = new int[k];
        for(int x = 0; x < k; x++) {
            result[x] = arr[x];
        }
        return result;
    }
}