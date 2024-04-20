class Problem2 {
    private int[] find(int[][] land,int row,int col){
        int[] res = new int[4];

        res[0] = row;
        res[1] = col;

        int r = row;
        int c = col;

        while(r < land.length && land[r][col] == 1){
            r++;
        }
        while(c < land[0].length && land[row][c] == 1){
            c++;
        }

        res[2] = r-1;
        res[3] = c-1;

        for(int i=row; i<r ; i++){
            for(int j=col; j<c; j++){
                land[i][j] = 0;
            }
        }
        return res;
    }

    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;

        ArrayList<int[]> list = new ArrayList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(land[i][j] == 1){
                    int[] allCoordinates = find(land,i,j);
                    list.add(allCoordinates);
                }
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}