class Problem {
    public int countNegatives(int[][] grid) {
       int rows=grid.length , cols=grid[0].length;
       int count=0;

       for(int row=0;row<rows;row++){
           if(grid[row][0]<0){
               count+=cols;
               continue;
           }

           if(grid[row][cols-1]>0){
               continue;
           }

           int low=0, high=cols-1;

           while(low<=high){
               int mid=low+(high-low)/2;

               if(grid[row][mid]<0){
                   high=mid-1;
               }else{
                   low=mid+1;
               }
           }
           count+=cols-low;
       }
       return count;
    }
}