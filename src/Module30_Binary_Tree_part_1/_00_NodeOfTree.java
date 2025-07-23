package Module30_Binary_Tree_part_1;

public class _00_NodeOfTree {
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static void display1(Node root){
        if(root == null) return;
        display1(root.left);
        display1(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(20);


//        System.out.println(a);
//        System.out.println(a.right);
//        System.out.println(a.left);
//        System.out.println(a.val);
//
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
//
//
//        a.left.right.val = 80;//e.val = 90;
//        System.out.println();
//        System.out.println(a.val);
//        System.out.println(a.left.val);
//        System.out.println(a.right.val);
//        System.out.println(a.left.right.val);


        display(a);
        System.out.println();
        display1(a);

    }
}
