class Problem {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int flag = 0;

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(mat[row][col] == 0){
                    mat[row][0] = 0;

                    if(col == 0){
                        flag = 1;
                    }else{
                        mat[0][col] = 0;
                    }
                }
            }
        }


        for(int col = 1; col < m; col++){
            if(mat[0][col] == 0){
                for(int row = 0; row < n; row++){
                    mat[row][col] = 0;
                }
            }
        }

        for(int row = 0; row < n; row++){
            if(mat[row][0] == 0){
                for(int col = 0; col < m; col++){
                    mat[row][col] = 0;
                }
            }
        }

        if(flag == 1){
            for(int row = 0; row < n; row++){
                mat[row][0] = 0;
            }
        }
    }

}