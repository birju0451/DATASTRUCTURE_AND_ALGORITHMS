package Module49_Graph4;

import java.util.*;

class Pair implements Comparable<Pair> {
    int node;
    double prob;

    Pair(int node, double prob) {
        this.node = node;
        this.prob = prob;
    }

    @Override
    public int compareTo(Pair p) {
        if(this.prob != p.prob)
            return Double.compare(this.prob, p.prob);
        return Integer.compare(this.node , p.node);
    }
}

public class _02_Path_With_Maximum_Probability {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            adj.get(u).add(new Pair(v, prob));
            adj.get(v).add(new Pair(u, prob));
        }

        double[] best = new double[n];
        best[start] = 1.0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((Collections.reverseOrder())); // max-heap
        pq.add(new Pair(start, 1.0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int node = cur.node;
            double prob = cur.prob;

            if (node == end) return prob;
            if (prob < best[node]) continue;

            for (Pair nei : adj.get(node)) {
                double newProb = prob * nei.prob;
                if (newProb > best[nei.node]) {
                    best[nei.node] = newProb;
                    pq.add(new Pair(nei.node, newProb));
                }
            }
        }
        return best[end];
    }

    public static void main(String[] args) {
        _02_Path_With_Maximum_Probability obj = new _02_Path_With_Maximum_Probability();
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] prob = {0.5, 0.5, 0.2};
        System.out.println(obj.maxProbability(3, edges, prob, 0, 2)); // 0.25
    }
}
