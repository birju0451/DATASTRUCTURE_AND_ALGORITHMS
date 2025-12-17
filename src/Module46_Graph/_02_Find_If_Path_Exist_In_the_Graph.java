package Module46_Graph;

import java.util.*;

public class _02_Find_If_Path_Exist_In_the_Graph {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if (start == end) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);

        }
        boolean[] vis = new  boolean[n];
        vis[start] = true;
        bfs(start,adj,vis);
        return vis[end];
    }

    private void bfs(int start, List<List<Integer>> adj, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int front = q.remove();
            for (int ele : adj.get(front)){
                if(!vis[ele]) vis[ele] = true;
            }
        }
    }

    public static void main(String[] args) {

    }
}
