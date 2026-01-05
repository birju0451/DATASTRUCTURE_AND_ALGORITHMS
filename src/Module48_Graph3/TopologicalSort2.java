package Module48_Graph3;
import java.util.*;

public class TopologicalSort2 {
    public static void dfs(int node, List<List<Integer>> adj,boolean[] visited, List<Integer> ans) {
        visited[node] = true;
        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) {
                dfs(nbr, adj, visited, ans);
            }
        }
        // add at beginning instead of stack push
        ans.add(node);
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
        List<Integer> ans = new ArrayList<>();

        // DFS for all nodes
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, ans);
            }
        }
        for (int i=ans.size()-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
        }

    }
}
