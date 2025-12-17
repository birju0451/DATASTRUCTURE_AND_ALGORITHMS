package Module42_BackTracking;
// hum kisi bhi board me kitna no of knight place kar sakate hai
public class _15_maxKnightsInNxNBoard {
    static int maxKnight = -1;
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        int i, j;

        // 2 Up 1 Right
        i = row - 2;
        j = col + 1;
        if(i>=0 && j<n && board[i][j]=='K') return false;

        // 2 Up 1 Left
        i = row - 2;
        j = col - 1;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

        // 2 Down 1 Right
        i = row + 2;
        j = col + 1;
        if(i<n && j<n && board[i][j]=='K') return false;

        // 2 Down 1 Left
        i = row + 2;
        j = col - 1;
        if(i<n && j>=0 && board[i][j]=='K') return false;

        // 2 Right 1 Up
        i = row - 1;
        j = col + 2;
        if(i>=0 && j<n && board[i][j]=='K') return false;

        // 2 Right 1 Down
        i = row + 1;
        j = col + 2;
        if(i<n && j<n && board[i][j]=='K') return false;

        // 2 Left 1 Up
        i = row - 1;
        j = col - 2;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

        // 2 Left 1 Down
        i = row + 1;
        j = col - 2;
        if(i<n && j>=0 && board[i][j]=='K') return false;

        return true;
    }
    public static void nKnight(char[][] board,int row,int col,int num){
        int n  = board.length;

        if(row == n){
            maxKnight = Math.max(maxKnight,num);
            return;
        }
        //if Knight is safe to place
        else if(isSafe(board,row,col)){
            board[row][col] = 'K';
            if(col != n-1) nKnight(board,row,col+1,num+1);
            else nKnight(board,row+1,0,num+1);
            board[row][col] = 'x';//backtrack
        }

        //if Knight is not safe to place
        if(col != n-1) nKnight(board,row,col+1,num);
        else nKnight(board,row+1,0,num);

    }
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nKnight(board,0,0,0);
        System.out.println("The maximum knight can be placed in the given chessboard :"+maxKnight);
    }
}
