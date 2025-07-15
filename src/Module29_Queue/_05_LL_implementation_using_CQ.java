package Module29_Queue;

public class _05_LL_implementation_using_CQ {

    // ✅ Node class
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // ✅ Circular Queue class using Linked List
    public static class CqueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        // ✅ Enqueue (add)
        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
                tail.next = head; // circular link
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head; // maintain circularity
            }
            size++;
        }

        // ✅ Peek front element
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty !");
                return -1;
            }
            return head.val;
        }

        // ✅ Dequeue (remove)
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty !");
                return -1;
            }
            int x = head.val;
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head; // keep circular link
            }
            size--;
            return x;
        }

        // ✅ Display the queue
        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty !");
                return;
            }

            Node temp = head;
            System.out.print("Queue: ");
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }

        // ✅ Check if queue is empty
        public boolean isEmpty() {
            return size == 0;
        }
    }

    // ✅ Main Method for Testing
    public static void main(String[] args) {
        CqueueLL q = new CqueueLL();
        q.display();              // should say empty
        q.add(10);
        q.add(20);
        System.out.println("Is Empty: " + q.isEmpty()); // false
        q.add(30);
        q.add(40);
        q.display();              // 10 -> 20 -> 30 -> 40 -> HEAD
        System.out.println("Peek: " + q.peek()); // 10
        q.remove();               // remove 10
        q.display();              // 20 -> 30 -> 40 -> HEAD
    }
}
