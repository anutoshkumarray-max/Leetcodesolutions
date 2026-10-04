class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        int maxfreq = 0;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            maxfreq = Math.max(maxfreq, freq[nums[i]]);
        }
        int ans = 0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxfreq){
                ans+=maxfreq;
            }
        }
        return ans;
    }
}