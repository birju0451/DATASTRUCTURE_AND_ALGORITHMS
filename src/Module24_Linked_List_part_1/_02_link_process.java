package Module24_Linked_List_part_1;

public class _02_link_process {
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

        System.out.println(a.val);
        System.out.println(a.next);
        System.out.println(b);

        //printing the value of each node one by one
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);

        System.out.println("b value is :"+a.next.val);// equal to b.val
        System.out.println("c value is :"+b.next.val);// equal to c.val
        System.out.println("d value is :"+c.next.val);// equal to d.val

        System.out.println("c value is :"+a.next.next.val);

    }
}
