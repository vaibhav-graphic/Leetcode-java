public class Approch_2 {
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] res=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // if(matrix[i][j]!=0){
                //     res[i][j]=-1;
                // }
                if(matrix[i][j]==0){
                    fillRow(res,i);
                    fillCol(res,j);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(res[i][j]==-1){
                    matrix[i][j]=0;
               }
            }
        }
    }

    private static void fillRow(int[][] res, int start){
        int m=res[0].length;

        for(int i=0;i<m;i++){
            res[start][i]=-1;
        }
    }

    private static void fillCol(int[][] res,int start){
        int n=res.length;

        for(int i=0;i<n;i++){
            res[i][start]=-1;
        }
    }
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 } };

        setZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
