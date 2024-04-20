class Problem {
    private int sRow, sCol ,eRow = 0, eCol = 0;

    private void dfs(int[][] land,int sRow,int sCol,ArrayList<int[]> list,int[] dirRow,int[] dirCol){
        if(land[sRow][sCol] == 0){
            return ;
        }
        eRow = Math.max(sRow,eRow);
        eCol = Math.max(sCol,eCol);

        land[sRow][sCol] = 0;

        for(int i=0; i<4; i++){
            int nRow = sRow + dirRow[i];
            int nCol = sCol + dirCol[i];

            if(nRow >= 0 && nRow < land.length && nCol >=0 && nCol < land[0].length && land[nRow][nCol] != 0){
                dfs(land,nRow,nCol,list,dirRow,dirCol);
            }
        }
    }
    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;

        ArrayList<int[]> list = new ArrayList<>();

        int[] dirRow = {-1,0,1,0};
        int[] dirCol = {0,1,0,-1};

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(land[i][j] == 1){
                    sRow = i;
                    sCol = j;
                    eRow = 0;
                    eCol = 0;
                    dfs(land,i,j,list,dirRow,dirCol);
                    list.add(new int[] {sRow,sCol,eRow,eCol});
                }
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}