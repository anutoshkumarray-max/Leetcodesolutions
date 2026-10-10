class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                while(map.containsKey(ch)){
                    map.remove(s.charAt(left));
                    left++;
                }
                map.put(ch,1);
            }
            int length=right-left+1;
            maxlen=Math.max(length,maxlen);
        }
        return maxlen;
    }
}