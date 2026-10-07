class Solution {
    public List<String> removeInvalidParentheses(String s) {
       HashSet<String> set = new HashSet<>();

        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                left++;
            } 
            else if (s.charAt(i) == ')') {

                if (left > 0) {
                    left--;
                } 
                else {
                    right++;
                }
            }
        }

        dfs(s, 0, left, right, 0, "", set);

        return new ArrayList<>(set);
    }


    public void dfs(String s, int index, int left, int right,
                    int balance, String current,
                    HashSet<String> set) {

        if (balance < 0) {
            return;
        }

        if (index == s.length()) {

            if (left == 0 && right == 0 && balance == 0) {
                set.add(current);
            }

            return;
        }

        char ch = s.charAt(index);


        // '('
        if (ch == '(') {

            // Remove '('
            if (left > 0) {
                dfs(s, index + 1, left - 1, right,
                    balance, current, set);
            }

            // Keep '('
            dfs(s, index + 1, left, right,
                balance + 1, current + ch, set);
        }


        // ')'
        else if (ch == ')') {

            // Remove ')'
            if (right > 0) {
                dfs(s, index + 1, left, right - 1,
                    balance, current, set);
            }

            // Keep ')'
            if (balance > 0) {
                dfs(s, index + 1, left, right,
                    balance - 1, current + ch, set);
            }
        }


        // Letter
        else {

            dfs(s, index + 1, left, right,
                balance, current + ch, set);
        }

    }
}