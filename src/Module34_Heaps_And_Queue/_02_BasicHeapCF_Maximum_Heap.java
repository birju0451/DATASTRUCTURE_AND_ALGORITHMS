package Module34_Heaps_And_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class _02_BasicHeapCF_Maximum_Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
        pq.add(-32);
        System.out.println(pq+" "+pq.peek());
    }
}
