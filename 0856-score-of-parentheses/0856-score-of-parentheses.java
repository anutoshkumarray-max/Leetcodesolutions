class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(score);
                score=0;
            }else{
                int oldscore = st.pop();
                if(s.charAt(i-1)=='('){
                    score = oldscore+1;
                }else{
                    score = oldscore+2*score;
                }
            }
        }
        return score;
    }
}