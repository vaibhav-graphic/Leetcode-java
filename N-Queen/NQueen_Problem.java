import java.util.Scanner;

class NQueen_Problem {

    public static void possibleBoards(char[][] board, int row) {
        int n = board.length;
        // base case
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        // recursive calls
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i) == true) {
                board[row][i] = 'Q';
                possibleBoards(board, row + 1);
                // backtracking call
                board[row][i] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;

        // check in east to west direction
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q')
                return false;
        }

        // check in north to south directrion
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // check in north east direction
        int i = row;
        int j = col;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        // check in south east direction
        i = row;
        j = col;

        while (i < n && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j++;

        }

        // check in north west direction
        i = row;
        j = col;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;

        }

        // check in south west direction
        i = row;
        j = col;

        while (i < n && j >= n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j--;

        }
        // we have check all the possible direction and we do not get the queen there so
        // we are return true
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of board -> ");
        int n = sc.nextInt();
        char[][] board = new char[n][n];

        // fill the board with 'X'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }

        possibleBoards(board, 0);
        sc.close();
    }
}