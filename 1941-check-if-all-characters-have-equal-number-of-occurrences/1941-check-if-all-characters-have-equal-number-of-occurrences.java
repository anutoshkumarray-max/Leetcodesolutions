class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int freq = map.get(s.charAt(0));
        for (char ch : map.keySet()) {
            if (map.get(ch) != freq) {
                return false;
            }
        }
        return true;
    }
}