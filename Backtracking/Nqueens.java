public class Nqueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // check vertically
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nqueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column looping
        for (int j = 0; j < board.length; j++) {
            int col = j;
            if (isSafe(board, row, col)) {
                board[row][j] = 'Q';
                nqueens(board, row + 1);// function call
                board[row][j] = 'X';// backtracking
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----chess board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // initialize a chess board
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nqueens(board, 0);
    }
}
