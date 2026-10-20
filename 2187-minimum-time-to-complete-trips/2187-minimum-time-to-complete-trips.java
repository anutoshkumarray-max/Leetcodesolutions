class Solution {
    public int max(int[] time) {
        int maximum = time[0];
        for (int i = 1; i < time.length; i++) {
            if (time[i] > maximum) {
                maximum = time[i];
            }
        }
        return maximum;
    }
    public long sum(int[] time, long mid) {
        long trips = 0;
        for (int i = 0; i < time.length; i++) {
            trips += mid / time[i];
        }

        return trips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long low = 1;
        long high = (long) max(time) * totalTrips;
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            long result = sum(time, mid);

            if (result >= totalTrips) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}