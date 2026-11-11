class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        if((long)cost1 + cost2 <= costBoth){
            ans += (long)need1 * cost1 + (long)need2 * cost2;
            return ans;
        }
        else{
            int both = Math.min(need1,need2);
            ans += (long)both * costBoth;
            need1 -= both;
            need2 -= both;
        }
        if(need1>0){
            ans += (long) need1 * Math.min(cost1,costBoth);
        }
        if(need2>0){
            ans += (long) need2 * Math.min(cost2,costBoth);
        }
        return ans;
    }
}