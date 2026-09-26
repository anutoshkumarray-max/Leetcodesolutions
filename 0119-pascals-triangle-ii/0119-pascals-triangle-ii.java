class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        long ans = 1;
        arr.add((int) ans);
        for(int i=1;i<=rowIndex;i++){
            ans = ans * (rowIndex-i+1);
            ans = ans/i;
            arr.add((int) ans);
        }
        return arr;
    }
}