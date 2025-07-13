
package Module24_Linked_List_part_1;

public class _06_Node_Insert_At_Head {
    Node head;  // non-static (object-specific)

    public void insertAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
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
        _06_Node_Insert_At_Head list = new _06_Node_Insert_At_Head();  // Create object
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.display();
    }
}




















//package Module24_Linked_List_part_1;
//
//public class _06_Node_Insert_At_Head {
//    static Node head;
//
//    public static void insertAtHead(int val) {
//        Node temp = new Node(val);
//        temp.next = head;
//        head = temp;
//    }
//
//    public static void display() {
//        Node curr = head;
//        while (curr != null) {
//            System.out.print(curr.val +" -> ");
//            curr = curr.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//        insertAtHead(30);
//        insertAtHead(20);
//        insertAtHead(10);
//        display();
//    }
//}
