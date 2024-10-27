class Tabulation {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;

        int[][] dp = new int[m][n];

        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                if(matrix[row][col] == 1){
                    if(row == 0 || col == 0){
                        dp[row][col] = 1;
                    }
                    else{
                        int up = dp[row - 1][col];
                        int left = dp[row][col - 1];
                        int dia = dp[row - 1][col - 1];

                        dp[row][col] = 1 + Math.min(up, Math.min(left, dia));
                    }
                    res += dp[row][col];
                }
            }
        }
        return res;
    }
}