package Module24_Linked_List_part_1;

public class _07_Node_Insert_At_middle {
    Node head;
    public void insertAtHead(int val) {
        Node temp = new Node(val);

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

    }
}
