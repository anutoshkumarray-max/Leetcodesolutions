class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder ans = new StringBuilder();
        while(!map.isEmpty()){
            int maxFreq=0;
            char maxChar=' ';
            for(char ch : map.keySet()){
                if(map.get(ch)>maxFreq){
                    maxFreq = map.get(ch);
                    maxChar = ch;
                }
            }
            for(int i=0;i<maxFreq;i++){
                ans.append(maxChar);
            }
            map.remove(maxChar);
        }
        return ans.toString();
    }
}