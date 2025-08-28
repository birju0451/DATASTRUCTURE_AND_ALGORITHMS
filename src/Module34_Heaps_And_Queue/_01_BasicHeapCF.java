package Module34_Heaps_And_Queue;

import java.util.PriorityQueue;

public class _01_BasicHeapCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
        pq.add(-32);
        System.out.println(pq);
    }
}
