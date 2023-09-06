public class Word_Search {

    public boolean exit(char [][] board,String word){
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if((board[i][j]==word.charAt(0)) && backtrack(board,i,j,0,word))
        return true;

        return false;
    } 

    private boolean backtrack(char [][]board,int i,int j,int count,String word){
        if(count == word.length())
        return true;
    
        if(i==-1 || i==board.length || j==-1 || j== board[0].length || board[i][j] != word.charAt(count))
        return false;
    
        char temp=board[i][j];
    
        board[i][j] = '*';
        boolean found =backtrack(board, i+1,j,count+1,word) ||
        backtrack(board, i-1,j,count+1,word) ||
        backtrack(board, i,j+1,count+1,word) ||
        backtrack(board, i,j-1,count+1,word);
    
        board[i][j]=temp;
        return found;
    }
    public static void main(String [] args){
        Word_Search obj=new Word_Search();
        
        char [][]arr={
            {'A','B','C','C'},
            {'s','F','C','S'},
            {'A','L','E','E'}
        };

        String word="ABCCED";

        boolean res=obj.exit(arr,word);
        System.out.println(res);
    }
}
