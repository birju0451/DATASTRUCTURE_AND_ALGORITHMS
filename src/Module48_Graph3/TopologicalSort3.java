package Module48_Graph3;

import java.util.*;

public class TopologicalSort3 {

    // DFS
    public static void dfs(int node, List<List<Integer>> adj,
                           boolean[] visited, List<Integer> topo) {

        visited[node] = true;

        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) {
                dfs(nbr, adj, visited, topo);
            }
        }

        // add at beginning instead of stack push
        topo.addFirst(node);
    }

    public static void main(String[] args) {

        int V = 5;

        // adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1));        // 0 -> 1
        adj.add(Arrays.asList(2, 3));     // 1 -> 2,3
        adj.add(Arrays.asList(3, 4));     // 2 -> 3,4
        adj.add(new ArrayList<>());       // 3
        adj.add(new ArrayList<>());       // 4

        boolean[] visited = new boolean[V];
        List<Integer> topo = new ArrayList<>();

        // DFS for all nodes
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, topo);
            }
        }

        System.out.println("Topological Sort: " + topo);
    }
}
