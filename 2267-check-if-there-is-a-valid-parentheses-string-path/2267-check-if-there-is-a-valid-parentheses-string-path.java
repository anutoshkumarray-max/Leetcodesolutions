 class Solution {
    public boolean hasValidPath(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        if (grid[0][0] == ')') {
            return false;
        }

        if (grid[m - 1][n - 1] == '(') {
            return false;
        }

        Queue<int[]> q = new LinkedList<>();

        boolean[][][] visited = new boolean[m][n][m + n];

        q.offer(new int[]{0, 0, 1});
        visited[0][0][1] = true;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int i = curr[0];
            int j = curr[1];
            int balance = curr[2];

            if (balance < 0) {
                continue;
            }

            if (i == m - 1 && j == n - 1) {
                if (balance == 0) {
                    return true;
                }
                continue;
            }

            // Down
            if (i + 1 < m) {

                int newBalance = balance;

                if (grid[i + 1][j] == '(') {
                    newBalance++;
                } else {
                    newBalance--;
                }

                if (newBalance >= 0 &&
                    !visited[i + 1][j][newBalance]) {

                    visited[i + 1][j][newBalance] = true;

                    q.offer(new int[]{
                        i + 1, j, newBalance
                    });
                }
            }

            // Right
            if (j + 1 < n) {

                int newBalance = balance;

                if (grid[i][j + 1] == '(') {
                    newBalance++;
                } else {
                    newBalance--;
                }

                if (newBalance >= 0 &&
                    !visited[i][j + 1][newBalance]) {

                    visited[i][j + 1][newBalance] = true;

                    q.offer(new int[]{
                        i, j + 1, newBalance
                    });
                }
            }
        }

        return false;
    }
}