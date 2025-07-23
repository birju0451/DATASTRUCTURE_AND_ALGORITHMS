package Module30_Binary_Tree_part_1;

public class _06_Size_Of_Tree {
    public static int Size(Node root){
        if(root == null) return 0;
        int Lsize = Size(root.left);
        int Rsize = Size(root.right);
        return 1+Lsize+Rsize;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(0);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(Size(a)); // Output: 5
    }
}
