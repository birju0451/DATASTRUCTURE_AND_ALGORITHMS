package Module50_Graph5;

import java.util.PriorityQueue;

public class Minimum_Cost_to_Connect_All_Point{
    static class Triplet implements Comparable<Triplet>{
        int node;
        int parent;
        int dist;

        Triplet(int node, int parent,int dist){
            this.node = node;
            this.parent = parent;
            this.dist = dist;
        }
        @Override
        public int compareTo(Triplet t) {
            if(this.dist != t.dist)
                return this.dist - t.dist;
            return this.node - t.node;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, -1, 0));
        boolean[] vis = new boolean[n];
        int sum = 0;

        while(!pq.isEmpty()){
            Triplet top = pq.remove();
            int node   = top.node,parent = top.parent,dist   = top.dist;
            if(vis[node] == true) continue;
            sum += dist;
            vis[node] = true;
            for(int i=0;i<n;i++){
                if(i == node) continue;
                if(vis[i]) continue;
                int x1 = points[node][0],y1 =points[node][1];
                int x2 = points[i][0] ,y2 = points[i][1];
                int mDist = Math.abs(x2-x1) + Math.abs(y2-y1);
                pq.add(new Triplet(i, node, mDist));
            }
        }
        return sum;
    }
}
