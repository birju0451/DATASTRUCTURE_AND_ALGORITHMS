package Module49_Graph4;

import java.util.PriorityQueue;

public class _02_Path_With_Minimum_Effort {
    public static class  Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int effort;
        Triplet(int row,int col,int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
        @Override
        public int compareTo(Triplet t) {
            if(this.effort == t.effort)
                return this.row - t.row;
            return this.effort - t.effort;
        }
    }
    public int minimumEffortPath(int[][] arr) {
        int m = arr.length,n=arr[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = Integer.MAX_VALUE;
            }
        }
        ans[0][0] = 0;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));
        while (pq.isEmpty()){
            Triplet top = pq.remove();
            int row = top.row;
            int col = top.col;
            int effort = top.effort;

            if(row==m-1 && col==n-1) break;

            if(row>0){//going up row - 1
                int e = Math.abs(arr[row][col]-arr[row-1][col]);
                e = Math.max(ans[row][col],ans[row-1][col]);
                if(ans[row-1][col] > e){
                    ans[row-1][col] = e;
                    pq.add(new Triplet(row-1,col,e));
                }
            }

            if(col>0){//going left col - 1
                int e = Math.abs(arr[row][col]-arr[row][col-1]);
                e = Math.max(ans[row][col],ans[row][col-1]);
                if(ans[row][col-1] > e){
                    ans[row][col-1] = e;
                    pq.add(new Triplet(row,col-1,e));
                }
            }

            if(row < m-1){//going dow row - 1
                int e = Math.abs(arr[row][col]-arr[row+1][col]);
                e = Math.max(ans[row][col],ans[row+1][col]);
                if(ans[row+1][col] > e){
                    ans[row+1][col] = e;
                    pq.add(new Triplet(row+1,col,e));
                }
            }

            if(col<n-1){//going right col + 1
                int e = Math.abs(arr[row][col]-arr[row][col+1]);
                e = Math.max(ans[row][col],ans[row][col+1]);
                if(ans[row][col+1] > e){
                    ans[row][col+1] = e;
                    pq.add(new Triplet(row,col+1,e));
                }
            }

        }
        return ans[m-1][n-1];
    }

    public static void main(String[] args) {

    }
}
