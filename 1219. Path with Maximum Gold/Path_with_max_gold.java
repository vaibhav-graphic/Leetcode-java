class Path_with_max_gold{
    static int max=0;
    private static int getMaximumGold(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    solve(grid,i,j,0);
                }
            }
        }
        return max;
    }

    private static void solve(int[][] grid, int row,int col,int ans){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0){
            max=Math.max(max,ans);
            return;
        }

        int val=grid[row][col];
        grid[row][col]=0;
        solve(grid,row-1,col,ans+val);
        solve(grid,row+1,col,ans+val);
        solve(grid,row,col-1,ans+val);
        solve(grid,row,col+1,ans+val);

        grid[row][col]=val;
    }
    public static void main(String [] args){
        int[][] arr={
            {1,0,7},
            {2,0,6},
            {3,4,5},
            {0,3,0},
            {9,0,20}
        };

        int res=getMaximumGold(arr);
        System.out.print("max gold avalibale in the cell are -> "+res);
    }
}