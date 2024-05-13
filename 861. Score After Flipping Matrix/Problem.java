class Problem {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i<m; i++){
            if(grid[i][0] == 0){
                for(int j=0; j<n; j++){
                    if(grid[i][j] == 1){
                        grid[i][j] = 0;
                    }else{
                        grid[i][j] = 1;
                    }
                }
            }
        }

        for(int col=0; col<n; col++){
            int countZero = 0;
            for(int row=0; row<m; row++){
                if(grid[row][col] == 0){
                    countZero++;
                }
            }
            int countOne = m - countZero;

            if(countZero > countOne){
                for(int row=0; row<m; row++){
                    if(grid[row][col] == 0){
                        grid[row][col] = 1;
                    }else{
                        grid[row][col] = 0;
                    }
                }
            }
        }

        int res = 0;
        for(int row=0; row<m; row++){
            int data = 0;
            for(int col=0; col<n; col++){
                data += grid[row][col] * Math.pow(2,n-col-1);
            }
            res += data;
        }

        return res;
    }
}