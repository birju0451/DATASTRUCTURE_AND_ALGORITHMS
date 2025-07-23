package Module30_Binary_Tree_part_1;

public class _03_ProductOf_Non_Zero_Element {
    public static int product(Node root) {
        if (root == null) return 1;
        if(root.val == 0) root.val = 1;
        return root.val * product(root.left) * product(root.right);
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

        int ans = product(a);
        System.out.println(ans);
    }
}