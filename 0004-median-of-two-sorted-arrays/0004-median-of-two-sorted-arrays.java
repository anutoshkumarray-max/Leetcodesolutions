class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        int[] arr3 = new int[n1+n2];
        int k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }else{
                arr3[k]=arr2[j];
                k++;j++;
            }
        }
        while(i<n1){
            arr3[k]=arr1[i];
            k++;i++;
        }
        while(j<n2){
            arr3[k]=arr2[j];
            k++;j++;
        }
        int n = n1+n2;
        if(n%2==1){
            return arr3[n/2];
        }
        return ((double) arr3[n / 2 - 1] + arr3[n / 2]) / 2;
    }
}