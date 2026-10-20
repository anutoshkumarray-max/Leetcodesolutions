class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long) m * k; 
        if (val > n) return -1; 
        
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // FIXED: Changed nums[i] to bloomDay[i]
            mini = Math.min(mini, bloomDay[i]); 
            maxi = Math.max(maxi, bloomDay[i]); 
        }
        
        int left = mini, right = maxi, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            // FIXED: Changed nums to bloomDay
            if (possible(bloomDay, mid, m, k)) {
                ans = mid; 
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return ans; 
    }
    
    private boolean possible(int[] nums, int day, int m, int k) {
        int n = nums.length; 
        int cnt = 0; 
        int noOfB = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] <= day) {
                cnt++; 
            } else {
                noOfB += (cnt / k);
                cnt = 0; 
            }
        }
        noOfB += (cnt / k); 
        return noOfB >= m;
    }
}
