class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num : map.keySet()){
            int freq = map.get(num);
            if(freq % k == 0){
                sum+=num*freq;
            }
        }
        return sum;
    }
}