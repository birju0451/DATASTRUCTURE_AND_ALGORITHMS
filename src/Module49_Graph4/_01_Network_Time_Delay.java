package Module49_Graph4;

import java.util.*;



public class _01_Network_Time_Delay {
    static class Pair{
        int node;
        int time;
        Pair(int node,int time){
            this.node = node;
            this.time = time;
        }
    }

    public int networkDelayTime(int[][] times, int n, int src) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<times.length;i++){
            int u = times[i][0];
            int v = times[i][1];
            int time = times[i][2];
            adj.get(u).add(new Pair(v, time));
        }

        int[] ans = new int[n+1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.time-b.time);
        pq.add(new Pair(src, 0));   // FIXED

        while(!pq.isEmpty()){
            Pair top = pq.remove();
            int node = top.node;
            int time = top.time;

            if(time > ans[node]) continue;

            for(Pair p: adj.get(node)){
                int totalTime = time + p.time;
                if(totalTime < ans[p.node]){
                    ans[p.node] = totalTime;
                    pq.add(new Pair(p.node, totalTime));
                }
            }
        }

        int max = -1;
        for(int i=1;i<=n;i++){
            if(ans[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, ans[i]);
        }
        return max;   // FIXED
    }

    public static void main(String[] args) {
        _01_Network_Time_Delay obj = new _01_Network_Time_Delay();
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        System.out.println(obj.networkDelayTime(times,4,2)); // Output: 2
    }
}
