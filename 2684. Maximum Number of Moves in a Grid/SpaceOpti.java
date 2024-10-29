public class SpaceOpti {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] prev = new int[m];
        int[] curr = new int[m];

        int ans = 0;

        for(int row = 0; row < m; row++){
            prev[row] = 1;
        }

        for(int col = n - 2; col >= 0; col--){
            for(int row = 0; row < m; row++){
                int upL = 0;
                if(row > 0 && grid[row][col] < grid[row - 1][col + 1]){
                    upL = prev[row - 1];
                }

                int left = 0;
                if(grid[row][col] < grid[row][col + 1]){
                    left = prev[row];
                }

                int doL = 0;
                if(row < m - 1 && grid[row][col] < grid[row + 1][col + 1]){
                    doL = prev[row + 1];
                }

                curr[row] = 1 + Math.max(upL, Math.max(left, doL));
            }
            prev = curr.clone();
        }

        for(int row = 0; row < m; row++){
            ans = Math.max(ans, prev[row]);
        }

        return ans > 0 ? ans - 1 : 0;
    }
}