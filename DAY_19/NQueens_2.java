/*
 This code runs on LeetCode only.
 There is no main() method here because LeetCode
 already has its own main class.

 To run this code in your editor,
 create a main class and call this function.
*/

class NQueens_2 {

    int count = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        board1(board, 0);
        return count;
    }

    public boolean issafe2(char[][] board, int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public void board1(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (issafe2(board, row, j)) {
                board[row][j] = 'Q';
                board1(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }
}
