package Module24_Linked_List_part_1;

class deleteMiddle {
    public Node Left_Middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class _09_Delete_The_middle_Node {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        head.next = b;
        b.next = c;
        c.next = d;


        System.out.println("Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        deleteMiddle d1 = new deleteMiddle();
        Node answer = d1.Left_Middle(head);
        System.out.println("\nMiddle Node is: " + answer.val);
    }
}
