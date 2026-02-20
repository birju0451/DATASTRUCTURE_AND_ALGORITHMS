package Module50_Graph5;

public class Find_The_Cities {
    class Solution {
        public int findTheCity(int n, int[][] edges, int threshold) {
            int[][] dist = new int[n][n];

            // Initialize distance matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j)
                        dist[i][j] = 0;   // distance to itself = 0
                    else
                        dist[i][j] = Integer.MAX_VALUE;
                }
            }

            //            for(int i = 0; i < edges.length; i++) {
            //                int u = edges[i][0];
            //                int v = edges[i][1];
            //                int wt = edges[i][2];
            //                dist[u][v] = wt;
            //                dist[v][u] = wt;
            //            }

            // Using for-each loop (same as above commented loop)
            for (int[] arr : edges) {
                int u = arr[0];
                int v = arr[1];
                int wt = arr[2];
                dist[u][v] = wt;
                dist[v][u] = wt;
            }

            // Floyd Warshall Algorithm
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if (dist[i][k] == Integer.MAX_VALUE ||
                                dist[k][j] == Integer.MAX_VALUE)
                            continue;

                        dist[i][j] = Math.min(dist[i][j],
                                dist[i][k] + dist[k][j]);
                    }
                }
            }

            int minCity = -1;
            int minCount = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int count = 0; // from i to j where dist[i][j] <= threshold

                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    if (dist[i][j] <= threshold)
                        count++;
                }

                // If tie, choose city with greater index
                if (count <= minCount) {
                    minCount = count;
                    minCity = i;
                }
            }

            return minCity;
        }
    }
}
