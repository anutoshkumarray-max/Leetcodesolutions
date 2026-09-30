class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Arrays.sort(nums4);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = nums3.length;
        int n4 = nums4.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                int sum = nums1[i]+nums2[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count = 0;
        for(int i=0;i<n3;i++){
            for(int j=0;j<n4;j++){
                int sum = nums3[i]+nums4[j];
                if(map.containsKey(-sum)){
                    count+=map.get(-sum);
                }
            }
        }
        return count;
    }
}