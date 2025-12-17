package Module42_BackTracking;

public class _02_PrintMazePath {
    static void mazePath(int sr, int sc, int er, int ec,String s) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        mazePath(sr, sc + 1, er, ec,s+"R");
        mazePath(sr + 1, sc, er, ec,s+"D");
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        mazePath(1, 1, row, col,"");
    }
}
