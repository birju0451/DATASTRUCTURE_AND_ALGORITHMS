package Module24_Linked_List_part_1;

public class _10_Node_Access {
    public static void main(String[] args) {
        Node a= new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Linked List:");
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        temp =a;
        for (int i = 1; i < 3; i++) {
           temp=temp.next;
        }
        System.out.println("\nThe 3rd value using one base indexing  : "+temp.val);

        temp =a;
        for (int i = 0; i < 2; i++) {
            temp=temp.next;
        }
        System.out.println("\nThe 3rd value using zero base indexing  : "+temp.val);
    }
}
