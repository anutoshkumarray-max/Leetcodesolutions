class Solution {
    public int maxDepth(String s) {
        int result = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==(')')){
                st.pop();
            }
            result = Math.max(result,st.size());
        }
        return result;
    }
}