class SpaceOptimization {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;

        int[] prev = new int[n];
        int[] curr = new int[n];

        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                if(matrix[row][col] == 1){
                    if(row == 0 || col == 0){
                        curr[col] = 1;
                    }
                    else{
                        int up = prev[col];
                        int left = curr[col - 1];
                        int dia = prev[col - 1];

                        curr[col] = 1 + Math.min(up, Math.min(left, dia));
                    }
                    res += curr[col];
                }else{
                    curr[col] = 0;
                }
            }
            prev = curr.clone();
        }
        return res;
    }
}