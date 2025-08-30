package Module34_Heaps_And_Queue;

import java.nio.channels.Pipe;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Leetcode_K_Closest_Point_To_Origin_Using_Pair_User_Datatype {
    public static class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static  int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Pair> map = new HashMap<>();
        for(int i=0;i<points.length;i++){
            int x = points[i][0],y = points[i][1];
            int d2 = x*x+y*y;
            pq.add(d2);
            map.put(d2,new Pair(x,y));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i <k; i++) {
            int dist = pq.remove();
            Pair pt = map.get(dist);
            ans[i][0] = pt.x;
            ans[i][1] = pt.y;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}, {1, 0}, {3, 2}};
        int[][] ans = kClosest(points, 2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
