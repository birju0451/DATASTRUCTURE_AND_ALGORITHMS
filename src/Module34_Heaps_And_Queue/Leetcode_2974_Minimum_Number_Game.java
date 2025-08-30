package Module34_Heaps_And_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Leetcode_2974_Minimum_Number_Game {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3};
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        while (pq.size()>0){
            int n = pq.remove();
            int m = pq.remove();
            list.add(m);
            list.add(n);
        }
        System.out.println(list);
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
