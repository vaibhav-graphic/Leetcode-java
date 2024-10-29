public class Tabulation {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;

        for(int row = 0; row < m; row++){
            dp[row][n - 1] = 1;
        }

        for(int col = n - 2; col >= 0; col--){
            for(int row = 0; row < m; row++){
                int upL = 0;
                if(row > 0 && grid[row][col] < grid[row - 1][col + 1]){
                    upL = dp[row - 1][col + 1];
                }

                int left = 0;
                if(grid[row][col] < grid[row][col + 1]){
                    left = dp[row][col + 1];
                }

                int doL = 0;
                if(row < m - 1 && grid[row][col] < grid[row + 1][col + 1]){
                    doL = dp[row + 1][col + 1];
                }

                dp[row][col] = 1 + Math.max(upL, Math.max(left, doL));
            }
        }

        for(int row = 0; row < m; row++){
            ans = Math.max(ans, dp[row][0]);
        }

        return ans > 0 ? ans - 1 : 0;
    }
}
