package Module50_Graph5;

import java.sql.Array;
import java.util.Arrays;

public class Network_Delay_Time_by_BellmanFordAlgorithm{
    public int networkDelayTime(int[][] times, int n, int src) {
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        for (int x = 0; x <=n-1; x++) {
            for (int i = 0; i < times.length; i++) {
                int u = times[i][0];
                int v = times[i][1];
                int wt = times[i][2];
                if(dist[u] !=Integer.MAX_VALUE && dist[u]+wt < dist[v]) dist[v] = dist[u] + wt;
            }
        }

        int max = 0;
        for (int i = 1;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            max = Math.max(max,dist[i]);
        }
        return max;
    }
}
