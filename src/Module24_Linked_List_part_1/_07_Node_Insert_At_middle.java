package Module24_Linked_List_part_1;

public class _07_Node_Insert_At_middle {
    Node head;
    public void insertAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }
    public void insertAtMiddle(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = temp;
            return;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = slow.next;
        slow.next = temp;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _07_Node_Insert_At_middle list = new _07_Node_Insert_At_middle();

        list.insertAtHead(5);
        list.insertAtHead(4);
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);

        list.insertAtMiddle(99);

        list.display();
    }
}
