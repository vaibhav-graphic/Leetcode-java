class Solution {
    public int minimumArea(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        
        // System.out.println(Arrays.toString(row));
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        int h = find(row);
        int w = find(col);
                
        return h * w;
    }
    
     private int find(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int len = 0; 
        
        while(i < j){
            if(arr[i] == 1 && arr[j] == 1){
                len = Math.max(len,j - i + 1);
                i++;
                j--;
            }
            else if(arr[i] == 1 && arr[j] != 1){
                j--;
            }
            else if(arr[i] != 1 && arr[j] == 1){
                i++;
            }else{
                i++; 
                j--;
            }
        }
               
        return len == 0 ? 1 : len;
    }
}