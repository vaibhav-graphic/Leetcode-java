class Solution {
    private boolean solve(char[][] board){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board.length; col++){

                if(board[row][col] == '.'){

                    for(char ch = '1'; ch <= '9'; ch++){
                        if(isValid(board, row, col, ch) == true){
                            board[row][col] = ch;

                            if(solve(board) == true) return true;
                            else board[row][col] = '.';

                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char ch){
        for(int i = 0; i < 9; i++){
            if(board[row][i] == ch){
                return false;
            }

            if(board[i][col] == ch){
                return false;
            }

            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == ch){
                return false;
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}