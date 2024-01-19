class Problem {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int[][] t = new int[n][n];

        for(int col=0; col<matrix.length; col++){
            t[0][col] = matrix[0][col];
        }

        for(int row=1; row<n; row++){
            for(int col=0; col<n; col++){

                int a = Integer.MAX_VALUE;
                int b = Integer.MAX_VALUE;
                int c = Integer.MAX_VALUE;

                if(col-1 >= 0){
                    a = t[row-1][col-1];
                }

                b = t[row-1][col];

                if(col+1 < n){
                    c = t[row-1][col+1];
                }
                t[row][col] = matrix[row][col] + Math.min(a,Math.min(b,c));
            }
        }

        int res = Integer.MAX_VALUE;
        int last = n - 1;

        for(int col=0; col<n; col++){
            res = Math.min(res,t[last][col]);
        }

        return res;
    }
}