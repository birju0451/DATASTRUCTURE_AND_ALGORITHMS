package Module24_Linked_List_part_1;

public class _01_Node_Creation {
    public static void main(String[] args) {
        //creating the node
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        System.out.println("\n"+a);//some address will print
        System.out.println(a.val);//10
        System.out.println(a.next);//null

        System.out.println("\n"+b);
        System.out.println(b.val);
        System.out.println(b.next);
    }
}
