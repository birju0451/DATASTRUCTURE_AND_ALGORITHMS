package Module34_Heaps_And_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class _05_MaximumProductOfTwoElementsInArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        PriorityQueue<Integer> pq_min =new PriorityQueue<>();
        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : nums){
            pq_min.add(ele);
            pq_max.add(ele);
        }
        int n = pq_max.peek();
        int m = pq_min.size();
        System.out.println((n-1)*(m-1));
    }
}
