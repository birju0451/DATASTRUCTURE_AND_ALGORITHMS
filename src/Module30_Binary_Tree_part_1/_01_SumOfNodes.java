package Module30_Binary_Tree_part_1;

public class _01_SumOfNodes {
    public static int sum(Node root){
        if(root == null) return 0;
        int sumleft  = sum(root.left);
        int sumright = sum(root.right);
        return root.val + sumleft + sumright;
//        return root.val + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(2);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        int ans = sum(a);
        System.out.println(ans); // should print 38
    }
}
