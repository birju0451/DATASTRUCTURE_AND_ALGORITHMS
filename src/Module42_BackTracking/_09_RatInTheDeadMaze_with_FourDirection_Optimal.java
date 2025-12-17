package Module42_BackTracking;

public class _09_RatInTheDeadMaze_with_FourDirection_Optimal {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        // 1 = open path
        // 0 = obstacle
        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };

        boolean[][] isVisited = new boolean[rows][cols];

        // start at (0,0), end at (rows-1, cols-1)
        print(0,0,rows-1,cols-1,"",maze);
    }

    private static void print(int sr, int sc, int er, int ec, String s, int[][] maze){

        // boundary check
        if(sr < 0 || sc < 0) return;      // out of maze (top or left)
        if(sr > er || sc > ec) return;    // out of maze (bottom or right)

        // destination reached → print the path
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        // blocked cell OR visited cell
        if(maze[sr][sc] == 0) return;     // 0 = obstacle
        if(maze[sr][sc] == -1) return;    // -1 = already visited in current path

        // mark current cell as visited (optimal: using maze itself)
        maze[sr][sc] = -1;

        // explore all 4 directions
        print(sr, sc+1, er, ec, s+"R", maze); // move right
        print(sr+1, sc, er, ec, s+"D", maze); // move down
        print(sr, sc-1, er, ec, s+"L", maze); // move left
        print(sr-1, sc, er, ec, s+"U", maze); // move up

        // backtracking → unmark visited so another path can use it
        maze[sr][sc] = 1;
    }
}
