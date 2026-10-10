class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] vis = new int[26];
        int n = sentence.length();
        for(int i=0;i<n;i++){
            vis[sentence.charAt(i)-'a']=1;
        }
        for(int i=0;i<26;i++){
            if(vis[i]==0){
                return false;
            }
        }
        return true;
    }
}