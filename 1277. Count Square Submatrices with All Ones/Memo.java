class Memo {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;

        int[][] dp = new int[m][n];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                if(matrix[row][col] == 1){
                    res += solve(matrix, row, col, dp);
                }
            }
        }

        return res;
    }

    private int solve(int[][] matrix, int row, int col, int[][] dp){
        if(row < 0 || row > matrix.length || col < 0 || col > matrix[0].length || matrix[row][col] == 0){
            return 0;
        }

        if(dp[row][col] != -1){
            return dp[row][col];
        }

        int up = solve(matrix, row - 1, col, dp);
        int dia = solve(matrix, row - 1, col - 1, dp);
        int left = solve(matrix, row, col - 1, dp);

        return dp[row][col] = 1 + Math.min(up, Math.min(dia, left));
    }
}