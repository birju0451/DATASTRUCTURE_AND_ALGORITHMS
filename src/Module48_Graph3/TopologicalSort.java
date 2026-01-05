package Module48_Graph3;

import java.util.*;

public class TopologicalSort {
    // DFS function
    public static void dfs(int node, List<List<Integer>> adj, boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for (int ele : adj.get(node)) {
            if (!visited[ele]) {
                dfs(ele, adj, visited, st);
            }
        }
        // push after visiting all neighbors
        st.push(node);
    }

    public static void main(String[] args) {

        int V = 5;

        // adjacency list creation
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1));        // 0 -> 1
        adj.add(Arrays.asList(2, 3));     // 1 -> 2,3
        adj.add(Arrays.asList(3, 4));     // 2 -> 3,4
        adj.add(new ArrayList<>());       // 3
        adj.add(new ArrayList<>());       // 4

        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();

        // call DFS for all components
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }

        // print topological order
        System.out.print("Topological Sort: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
