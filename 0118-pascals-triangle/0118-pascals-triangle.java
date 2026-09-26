class Solution {
    public List<Integer> pascalTriangleII(int row) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        long ans = 1;
        for(int i=1;i<row;i++){
            ans = ans * (row - i) / i;
            arr.add((int)ans);
        }
        return arr;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(pascalTriangleII(i));
        }
        return result;
    }
}