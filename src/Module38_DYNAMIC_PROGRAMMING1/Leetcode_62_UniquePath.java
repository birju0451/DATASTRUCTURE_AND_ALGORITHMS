package Module38_DYNAMIC_PROGRAMMING1;

public class Leetcode_62_UniquePath {

    private static int Paths(int row, int col, int m, int n) {
        if(row == m || col==n) return 1;
        int rightWays = Paths(row,col+1,m,n);
        int downWays = Paths(row+1,col,m,n);
        return rightWays + downWays;
    }
    public static int uniquePaths(int m, int n) {
        return Paths(0,0,m,n);
    }

}
