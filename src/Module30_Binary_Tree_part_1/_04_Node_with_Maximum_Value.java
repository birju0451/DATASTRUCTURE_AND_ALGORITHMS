package Module30_Binary_Tree_part_1;

public class _04_Node_with_Maximum_Value {
    public static int Maximum(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int leftMax = Maximum(root.left);
        int rightMax = Maximum(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
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

        System.out.println(Maximum(a)); // Output: 5
    }
}
