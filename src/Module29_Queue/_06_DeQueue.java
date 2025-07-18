package Module29_Queue;

import java.util.*;

public class _06_DeQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.addLast(29);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.add(1);
        dq.add(2);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(3);
        dq.add(5);
        dq.removeLastOccurrence(3);
        dq.removeFirstOccurrence(2);
        System.out.println(dq);

    }
}
