class Problem {
    int premeter = 0;
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dirRow = {-1,0,1,0};
        int[] dirCol = {0,1,0,-1};

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    dfs(grid,m,n,i,j,dirRow,dirCol);
                    return premeter;
                }
            }
        }
        return -1;
    }

    private void dfs(int[][] grid,int m,int n,int row,int col,int[] dirRow,int[] dirCol){

        if(row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == 0){
            premeter++;
            return;
        }

        if(grid[row][col] == -1){
            return;
        }

        grid[row][col] = -1;

        for(int i=0; i<4; i++){
            int nRow = row + dirRow[i];
            int nCol = col + dirCol[i];

            dfs(grid,m,n,nRow,nCol,dirRow,dirCol);
        }
    }
}