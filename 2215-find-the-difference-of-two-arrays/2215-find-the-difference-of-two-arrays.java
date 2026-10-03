class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],1);
        }
        for(int j=0;j<nums2.length;j++){
            map2.put(nums2[j],1);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!map2.containsKey(nums1[i]) && !list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!map1.containsKey(nums2[i]) && !list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}