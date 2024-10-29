import java.util.Arrays;

public class Memo {
     public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        for(int row = 0; row < m; row++){
            ans = Math.max(ans, solve(grid, row, 0, m, n, 0, dp));
            // System.out.println(ans + " " + grid[row][0]);
        }

        return ans > 0 ? ans - 1 : 0;
    }

    private int solve(int[][] grid, int row, int col, int m, int n, int prev, int[][] dp){
        if(row < 0 || row >= m || col >= n || grid[row][col] <= prev){
            return 0;
        }

        if(dp[row][col] != -1){
            return dp[row][col];
        }
        
        // System.out.print(grid[row][col] + " " + prev + " ");

        int upR = 1 +  solve(grid, row - 1, col + 1, m, n, grid[row][col], dp);
        int right = 1 + solve(grid, row, col + 1, m, n, grid[row][col], dp);
        int doR = 1 + solve(grid, row + 1, col + 1, m, n, grid[row][col], dp);

        return dp[row][col] = Math.max(upR, Math.max(right, doR));
    }
}
