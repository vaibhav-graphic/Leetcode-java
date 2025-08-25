class Problem {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int row=0;
        int col=0;

        int[] ans=new int[m*n];
        int index=0;
        boolean up=true;

        while(row<m && col<n){
            if(up==true){
                while(row>0 && col<n-1){
                    ans[index++]=mat[row][col];
                    row--;
                    col++;
                }
                ans[index++]=mat[row][col];
                if(col == n-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while(row <m-1 && col>0){
                    ans[index++]=mat[row][col];
                    row++;
                    col--;
                }
                ans[index++]=mat[row][col];
                if(row == m-1){
                    col++;
                }else{
                    row++;
                }
            }
            up=!up;
        }
        return ans;
    }
}