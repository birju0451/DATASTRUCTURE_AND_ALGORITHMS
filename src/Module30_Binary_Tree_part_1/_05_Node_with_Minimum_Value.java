package Module30_Binary_Tree_part_1;

public class _05_Node_with_Minimum_Value {
    public static int minimum(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        int leftMIn = minimum(root.left);
        int rightMin = minimum(root.right);

        return Math.min(root.val, Math.min(leftMIn, rightMin));
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(-10);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(0);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(minimum(a)); // Output: 5
    }
}
