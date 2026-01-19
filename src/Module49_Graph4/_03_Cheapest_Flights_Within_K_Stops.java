package Module49_Graph4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _03_Cheapest_Flights_Within_K_Stops {
    public static class Pair{
        int node;
        int cost;
        Pair(int node,int cost){
            this.node = node;
            this.cost = cost;
        }
    }
    public static class Triplet{
        int node ;
        int cost ;
        int stops;
        Triplet(int node,int cost,int stops){
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<flights.length;i++){
            int from = flights[i][0], to = flights[i][1], price = flights[i][2];
            adj.get(from).add(new Pair(to,price));
        }

        int[] ans = new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>((a,b)->{
            if(a.cost != b.cost)
                return a.cost - b.cost;
            return a.node - b.node;
        });
        pq.add(new Triplet(src,0,0));

        while(!pq.isEmpty()){
            Triplet top = pq.remove();
            int node = top.node, cost = top.cost, stops = top.stops;
            if(node == dst) return cost;
            if(stops == k+1) continue;
            for(Pair p : adj.get(node)){
                int totalCost = top.cost + p.cost;
                if(ans[p.node] > totalCost){
                    ans[p.node] = totalCost;
                    pq.add(new Triplet(p.node,totalCost,stops+1));
                }
            }
        }
        return ans[dst];
    }
}
