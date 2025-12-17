package Module42_BackTracking;

public class _12_N_Queens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // fill board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';
            }
        }

        nqueen(board, 0);
    }

    private static void nqueen(char[][] board, int row) {
        int n = board.length;

        // base case
        if(row == n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';   // place queen
                nqueen(board, row + 1);  // next row
                board[row][col] = 'X';   // backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // check column upwards
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q') return false;
        }

        // check north-west diagonal
        int i = row, j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q') return false;
            i--; j--;
        }

        // check north-east diagonal
        i = row; j = col;
        while(i >= 0 && j < n){
            if(board[i][j] == 'Q') return false;
            i--; j++;
        }

        return true;
    }
}
