class Recursion {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;

        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                if(matrix[row][col] == 1){
                    res += solve(matrix, row, col);
                }
            }
        }

        return res;
    }

    private int solve(int[][] matrix, int row, int col){
        if(row < 0 || row > matrix.length || col < 0 || col > matrix[0].length || matrix[row][col] == 0){
            return 0;
        }

        int up = solve(matrix, row - 1, col);
        int dia = solve(matrix, row - 1, col - 1);
        int left = solve(matrix, row, col - 1);

        return 1 + Math.min(up, Math.min(dia, left));
    }
}