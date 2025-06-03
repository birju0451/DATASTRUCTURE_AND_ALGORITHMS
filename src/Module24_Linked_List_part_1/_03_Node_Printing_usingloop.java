package Module24_Linked_List_part_1;

public class _03_Node_Printing_usingloop {
    public static void main(String[] args) {
        //creating the node
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;// 10 -> 20
        b.next=c;// 10 -> 20 -> 30
        c.next=d;// 10 -> 20 -> 30 -> 40
        d.next=e;// 10 -> 20 -> 30 -> 40 ->50

        Node temp = a;
        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
