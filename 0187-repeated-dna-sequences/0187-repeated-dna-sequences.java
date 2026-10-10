class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        if(n < 10){
            return ans;
        }
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for(int i=0;i<=n-10;i++){
            String str = s.substring(i,i+10);
            if(seen.contains(str)){
                repeated.add(str);
            }else{
                seen.add(str);
            }
        }
        ans.addAll(repeated);
        return ans;
    }
}