class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=2;i<n;i++){
            int second = n-i;
            if(i<=second && isPrime(i) && isPrime(second)){
                ans.add(Arrays.asList(i, second));
            }
        }
        return ans;
    }
    public boolean isPrime(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}