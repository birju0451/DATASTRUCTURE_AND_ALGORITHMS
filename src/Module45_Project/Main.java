package Module45_Project;

import java.util.*;

class Pair implements Comparable<Pair> {
    int node;
    int dist;

    Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }

    @Override
    public int compareTo(Pair other) {
        if (this.dist != other.dist)
            return this.dist - other.dist;
        return this.node - other.node;   // smaller node first
    }

}

class Solution {

    public int[] dijkstra(int V, List<List<Pair>> adj, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {

            Pair cur = pq.poll();
            int u = cur.node;
            int d = cur.dist;

            if (d > dist[u]) continue;

            for (Pair nei : adj.get(u)) {
                int v = nei.node;
                int wt = nei.dist;

                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        return dist;
    }
}

public class Main {
    public static void main(String[] args) {

        int V = 5;
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Graph edges (u -> v, weight)
        adj.get(0).add(new Pair(1, 4));
        adj.get(0).add(new Pair(2, 1));
        adj.get(2).add(new Pair(1, 2));
        adj.get(1).add(new Pair(3, 1));
        adj.get(2).add(new Pair(3, 5));
        adj.get(3).add(new Pair(4, 3));

        Solution sol = new Solution();
        int[] ans = sol.dijkstra(V, adj, 0);

        System.out.println("Shortest distances from source 0:");
        for (int i = 0; i < ans.length; i++) {
            System.out.println("0 -> " + i + " = " + ans[i]);
        }
    }
}
