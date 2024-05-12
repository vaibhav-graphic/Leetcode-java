class Problem {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n-2][n-2];

        int index_i = 0;
        int index_j = 0;

        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int max = Integer.MIN_VALUE;

                for(int row=0; row<3; row++){
                    for(int col=0; col<3; col++){
                        max = Math.max(max,grid[row+i][col+j]);
                    }
                }

                if(index_j >= n-2){
                    index_i++;
                    index_j = 0;
                }

                res[index_i][index_j] = max;
                index_j++;
            }
        }
        return res;
    }
}