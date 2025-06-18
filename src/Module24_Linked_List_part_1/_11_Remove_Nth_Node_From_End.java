package Module24_Linked_List_part_1;

public class _11_Remove_Nth_Node_From_End {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
//        Node f = new Node(60);
//        Node g = new Node(70);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next = f;
//        f.next = g;

        System.out.println("Linked List:");
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println(); // line break

        int k = 2;
        Node pos  = a;
        Node slow = a;
        Node fast = a;

        for (int i = 1; i < k; i++) {
                pos = pos.next;
        }
        System.out.println(pos.val);


        for (int i = 1; i <= k; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }

        if (fast != null) {
            int data1 = fast.val;
            System.out.println("Value after moving " + k + " steps from head: " + data1);
        } else {
            System.out.println("Fast pointer became null. 'k' might be too large.");
        }

        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(slow.val);

        int tmp = slow.val;
        slow.val =pos.val;
        pos.val = tmp;

        temp = a;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
