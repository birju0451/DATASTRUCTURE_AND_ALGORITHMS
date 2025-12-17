package Module42_BackTracking;

public class _01_MazePath {

    static int mazePath(int sr, int sc, int er, int ec) {
        // If we reach the destination
        if (sr == er && sc == ec) return 1;

        // If outside the grid
        if (sr > er || sc > ec) return 0;

        // Move Right and Move Down
        int right = mazePath(sr, sc + 1, er, ec);
        int down = mazePath(sr + 1, sc, er, ec);

        return right + down;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        int count = mazePath(1, 1, row, col);
        System.out.println("Total Paths = " + count);
    }
}
