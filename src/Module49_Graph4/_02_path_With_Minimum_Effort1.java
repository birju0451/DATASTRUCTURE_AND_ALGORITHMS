package Module49_Graph4;

import java.util.PriorityQueue;   // missing import

public class _02_path_With_Minimum_Effort1 {

    // Triplet class to store row, col and effort for priority queue
    public static class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int effort;
        Triplet(int row,int col,int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
        // PriorityQueue will sort by minimum effort
        @Override
        public int compareTo(Triplet t) {
            if(this.effort == t.effort)
                return this.row - t.row;
            return this.effort - t.effort;
        }
    }

    // Function to find minimum effort path
    public int minimumEffortPath(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = Integer.MAX_VALUE;
            }
        }

        ans[0][0] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));

        while (!pq.isEmpty()){
            Triplet top = pq.remove();
            int row = top.row;
            int col = top.col;
            int effort = top.effort;

            if(row==m-1 && col==n-1) break;

            if(row>0){
                int e = Math.abs(arr[row][col]-arr[row-1][col]);
                e = Math.max(effort, e);
                if(ans[row-1][col] > e){
                    ans[row-1][col] = e;
                    pq.add(new Triplet(row-1,col,e));
                }
            }

            if(col>0){
                int e = Math.abs(arr[row][col]-arr[row][col-1]);
                e = Math.max(effort, e);
                if(ans[row][col-1] > e){
                    ans[row][col-1] = e;
                    pq.add(new Triplet(row,col-1,e));
                }
            }

            if(row < m-1){
                int e = Math.abs(arr[row][col]-arr[row+1][col]);
                e = Math.max(effort, e);
                if(ans[row+1][col] > e){
                    ans[row+1][col] = e;
                    pq.add(new Triplet(row+1,col,e));
                }
            }

            if(col<n-1){
                int e = Math.abs(arr[row][col]-arr[row][col+1]);
                e = Math.max(effort, e);
                if(ans[row][col+1] > e){
                    ans[row][col+1] = e;
                    pq.add(new Triplet(row,col+1,e));
                }
            }
        }

        return ans[m-1][n-1];
    }

    // Main method for testing
    public static void main(String[] args) {
        _02_path_With_Minimum_Effort1 obj = new _02_path_With_Minimum_Effort1(); // fixed
        int[][] arr = {
                {1,2,2},
                {3,8,2},
                {5,3,5}
        };
        System.out.println(obj.minimumEffortPath(arr));
    }
}
