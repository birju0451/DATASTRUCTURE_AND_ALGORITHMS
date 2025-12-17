package Module42_BackTracking;
//No backtracking
public class _07_RatInTheDeadMaze_Forward_DownWard{
    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        int[][] maze = {{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};
        System.out.println("with obstacle");
        print(0,0,row-1,col-1,"",maze);

        int[][]maze1 = {{1,1,1,1,1,1},
                        {1,1,1,1,1,1},
                        {1,1,1,1,1,1},
                        {1,1,1,1,1,1}};
        System.out.println("without obstacle");
        print(0,0,row-1,col-1,"",maze1);
    }
    public static void print(int sr,int sc,int er,int ec,String s,int[][] maze){
        if(sr>er || sc>ec) return;
        if(sr == er && sc==ec){
            System.out.println(s);
            return;
        }
        //obstacle
        if(maze[sr][sc] == 0) return;

        //go right
        print(sr, sc+1, er, ec, s+"R", maze);
        //go down
        print(sr+1, sc, er, ec, s+"D", maze);
    }
}
