class Approch_1{
    public static void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int row=0;
            int col=n-1;
            while(row<col){
                int temp=matrix[i][row];
                matrix[i][row]=matrix[i][col];
                matrix[i][col]=temp;

                row++;
                col--;
            }
        }
    }
    public static void main(String[] args){
        int[][] arr={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        rotate(arr);
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}