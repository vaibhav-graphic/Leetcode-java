import java.util.ArrayList;
import java.util.List;

class LuckyNumbersinaMatrix{
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((isRow(matrix,i,j)==true) && (isCol(matrix,i,j)==true))
                    res.add(matrix[i][j]);
            }
        }
        return res;
    }

    private boolean isRow(int[][] nums,int row, int col){
        int m=nums[0].length;

        for(int i=0;i<m;i++){
            if(nums[row][col]>nums[row][i])
                return false;
        }
        return true;
    }

    private boolean isCol(int[][] nums,int row,int col){
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[row][col]<nums[i][col])
                return false;
        }
        return true;
    }
    public static void main(String [] args){
        LuckyNumbersinaMatrix obj=new LuckyNumbersinaMatrix();
        int[][] arr={{1,10,4,2},
        {9,3,8,7},
        {15,16,17,12}};

        List<Integer> res=obj.luckyNumbers(arr);
        
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
}