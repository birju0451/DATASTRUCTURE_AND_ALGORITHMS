package Module34_Heaps_And_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class _06_Sort_a_K_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > 3) {
                ans.add(pq.remove());
            }
        }
        for (int i = 0; i < k; i++) {
            ans.add(pq.remove());
        }
        System.out.println(ans);
    }
}
