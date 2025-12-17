package Module42_BackTracking;

public class _04_FourDirectionMazePath_With_SomeIssue_Phase1 {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        print(0, 0, row - 1, col - 1, "");
    }

    public static void print(int sr, int sc, int er, int ec, String s) {
        // boundary
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;

        // reached end
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // go right
        print(sr, sc + 1, er, ec, s + "R");

        // go down
        print(sr + 1, sc, er, ec, s + "D");

        // go left
        print(sr, sc - 1, er, ec, s + "L");

        // go up
        print(sr - 1, sc, er, ec, s + "U");
    }
}
