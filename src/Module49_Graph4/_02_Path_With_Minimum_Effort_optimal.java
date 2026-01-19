package Module49_Graph4;

import java.util.PriorityQueue;

public class _02_Path_With_Minimum_Effort_optimal {
    public static class Triplet implements Comparable<Triplet>{
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
            return this.effort - t.effort;
        }
    }

    public int minimumEffortPath(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] ans = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = Integer.MAX_VALUE;
            }
        }

        ans[0][0] = 0;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));

        int[] r = {-1,0,1,0};
        int[] c = {0,-1,0,1};

        while(pq.size()>0){
            Triplet top = pq.remove();
            int row = top.row, col = top.col, effort = top.effort;

            if(row==m-1 && col==n-1) break;

            for(int i=0;i<=3;i++){
                int newRow = row + r[i];
                int newCol = col + c[i];

                // correct boundary check
                if(newRow < 0 || newCol < 0 || newRow >= m || newCol >= n) continue;

                int e = Math.abs(arr[row][col] - arr[newRow][newCol]);
                e = Math.max(e, effort);
                if(e < ans[newRow][newCol]){
                    ans[newRow][newCol] = e;
                    pq.add(new Triplet(newRow,newCol,e));
                }
            }
        }
        return ans[m-1][n-1];
    }

    public static void main(String[] args) {
        _02_Path_With_Minimum_Effort_optimal obj = new _02_Path_With_Minimum_Effort_optimal();
        int[][] arr = {
                {1,2,2},
                {3,8,2},
                {5,3,5}
        };
        System.out.println(obj.minimumEffortPath(arr)); // Output: 2
    }
}
