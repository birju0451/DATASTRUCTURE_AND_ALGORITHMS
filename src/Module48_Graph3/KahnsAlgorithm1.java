package Module48_Graph3;

import java.util.*;

public class KahnsAlgorithm1 {
    public static void main(String[] args) {
        int V = 5;
        // Adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1));        // 0 → 1
        adj.add(Arrays.asList(2, 3));     // 1 → 2,3
        adj.add(Arrays.asList(3, 4));     // 2 → 3,4
        adj.add(new ArrayList<>());       // 3
        adj.add(new ArrayList<>());       // 4

        // Step 1: Calculate indegree
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int nbr : adj.get(i)) {
                indegree[nbr]++;
            }
        }

        // Step 2: Push all 0-indegree nodes into queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: BFS
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            for (int nbr : adj.get(node)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) {
                    q.add(nbr);
                }
            }
        }

        // Step 4: Check cycle
        if (topo.size() != V) {
            System.out.println("Cycle detected! Topological sort not possible.");
        } else {
            System.out.println("Topological Sort: " + topo);
        }
    }
}
