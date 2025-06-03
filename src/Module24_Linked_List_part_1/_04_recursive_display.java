package Module24_Linked_List_part_1;

public class _04_recursive_display {
    public static void displayReecursive(Node head){
        Node temp = head;
        if( temp == null){
            return;
        }
//        temp=temp.next;
        displayReecursive(temp.next);
        System.out.println(temp.val);

    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;// 10 -> 20
        b.next=c;// 10 -> 20 -> 30
        c.next=d;// 10 -> 20 -> 30 -> 40
        d.next=e;// 10 -> 20 -> 30 -> 40 ->50

        displayReecursive(a);
    }
}
