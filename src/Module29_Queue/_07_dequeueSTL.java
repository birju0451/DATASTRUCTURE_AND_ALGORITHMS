package Module29_Queue;
import java.util.*;
public class _07_dequeueSTL{
        public static void main(String[] args) {
            Deque<Integer> dq = new ArrayDeque<>();

            // Insertion Operations
            dq.addFirst(10);                  // Inserts at front
            dq.addLast(20);                   // Inserts at rear
            dq.offerFirst(5);                 // Inserts at front (returns true/false)
            dq.offerLast(25);                 // Inserts at rear (returns true/false)
            dq.add(15);                       // Adds to rear by default
            System.out.println("After insertions: " + dq);

            // Access Operations (Peek)
            System.out.println("Front element: " + dq.peekFirst()); // View front
            System.out.println("Rear element: " + dq.peekLast());   // View rear
            System.out.println("Peek (default rear): " + dq.peek()); // Same as peekFirst()

            // Deletion Operations
            dq.removeFirst();                // Removes front
            dq.removeLast();                 // Removes rear
            dq.pollFirst();                  // Removes front (returns null if empty)
            dq.pollLast();                   // Removes rear (returns null if empty)
            dq.remove();                     // Removes front by default
            System.out.println("After deletions: " + dq);

            // Other Utility Operations
            dq.clear();                      // Removes all elements
            System.out.println("Is empty after clear? " + dq.isEmpty());

            dq.addAll(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("Deque after addAll: " + dq);

            System.out.println("Size of deque: " + dq.size());
            System.out.println("Contains 3? " + dq.contains(3));

            // 🔷 Iterating Deque
            System.out.print("Forward Iteration: ");
            for (int val : dq) {
                System.out.print(val + " ");
            }

            System.out.print("\nReverse Iteration: ");
            Iterator<Integer> it = dq.descendingIterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }
}
