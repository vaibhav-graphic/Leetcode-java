class Problem {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int[] dirRow = {-1,0,1,0};
        int[] dirCol = {0,1,0,-1};

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j,dirRow,dirCol);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid,int row,int col,int[] dirRow,int[] dirCol){
        if(grid[row][col] == '0'){
            return;
        }

        grid[row][col] = '0';

        for(int i=0; i<4; i++){
            int nRow = row + dirRow[i];
            int nCol = col + dirCol[i];

            if(nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[0].length && grid[nRow][nCol] != '0'){
                dfs(grid,nRow,nCol,dirRow,dirCol);
            }
        }
    }
}