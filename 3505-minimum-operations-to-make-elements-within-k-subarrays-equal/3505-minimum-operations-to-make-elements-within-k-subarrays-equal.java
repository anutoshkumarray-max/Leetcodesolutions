
import java.util.*;

class Solution {

    TreeMap<Integer, Integer> low = new TreeMap<>();
    TreeMap<Integer, Integer> high = new TreeMap<>();

    int sizeLow = 0, sizeHigh = 0;
    long sumLow = 0, sumHigh = 0;

    void add(TreeMap<Integer, Integer> map, int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
    }

    void remove(TreeMap<Integer, Integer> map, int val) {
        int count = map.get(val);

        if (count == 1) {
            map.remove(val);
        } else {
            map.put(val, count - 1);
        }
    }

    void addNum(int val) {
        if (low.isEmpty() || val <= low.lastKey()) {
            add(low, val);
            sizeLow++;
            sumLow += val;
        } else {
            add(high, val);
            sizeHigh++;
            sumHigh += val;
        }

        balance();
    }

    void removeNum(int val) {
        if (low.containsKey(val)) {
            remove(low, val);
            sizeLow--;
            sumLow -= val;
        } else {
            remove(high, val);
            sizeHigh--;
            sumHigh -= val;
        }

        balance();
    }

    void balance() {
        while (sizeLow > sizeHigh + 1) {
            int val = low.lastKey();

            remove(low, val);
            sizeLow--;
            sumLow -= val;

            add(high, val);
            sizeHigh++;
            sumHigh += val;
        }

        while (sizeLow < sizeHigh) {
            int val = high.firstKey();

            remove(high, val);
            sizeHigh--;
            sumHigh -= val;

            add(low, val);
            sizeLow++;
            sumLow += val;
        }
    }

    long getCost() {
        long median = low.lastKey();

        return median * sizeLow - sumLow
             + sumHigh - median * sizeHigh;
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;
        int m = n - x + 1;

        long[] cost = new long[m];

        // Step 1: Calculate cost of every window of size x

        for (int i = 0; i < x; i++) {
            addNum(nums[i]);
        }

        cost[0] = getCost();

        for (int i = x; i < n; i++) {

            removeNum(nums[i - x]);
            addNum(nums[i]);

            cost[i - x + 1] = getCost();
        }

        // Step 2: DP

        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[m + 1][k + 1];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][0] = 0;
        }

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= k; j++) {

                // Do not select current window
                dp[i][j] = dp[i - 1][j];

                // Select current window
                int prev = Math.max(0, i - x);

                if (dp[prev][j - 1] != INF) {
                    dp[i][j] = Math.min(
                        dp[i][j],
                        dp[prev][j - 1] + cost[i - 1]
                    );
                }
            }
        }

        return dp[m][k];
    }
}
