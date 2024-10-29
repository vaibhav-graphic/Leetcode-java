class Recusions {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        for(int row = 0; row < m; row++){
            ans = Math.max(ans, solve(grid, row, 0, m, n, 0));
            // System.out.println(ans + " " + grid[row][0]);
        }

        return ans > 0 ? ans - 1 : 0;
    }

    private int solve(int[][] grid, int row, int col, int m, int n, int prev){
        if(row < 0 || row >= m || col >= n || grid[row][col] <= prev){
            return 0;
        }
        
        // System.out.print(grid[row][col] + " " + prev + " ");

        int upR = 1 +  solve(grid, row - 1, col + 1, m, n, grid[row][col]);
        int right = 1 + solve(grid, row, col + 1, m, n, grid[row][col]);
        int doR = 1 + solve(grid, row + 1, col + 1, m, n, grid[row][col]);

        return Math.max(upR, Math.max(right, doR));
    }
}