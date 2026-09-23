class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low % 2 == 0){
            low = low + 1;
        }
        if(high % 2 == 0){
            high = high - 1;
        }
        for(int i=low;i<=high;i+=2){
            count++;
        }
        return count;
    }
}