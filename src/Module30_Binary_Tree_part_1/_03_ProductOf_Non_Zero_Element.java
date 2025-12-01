package Module30_Binary_Tree_part_1;

public class _03_ProductOf_Non_Zero_Element {
    public static int product1(Node root) {
        if (root == null) return 1;

        int left = product1(root.left);
        int right = product1(root.right);

        // if current node value is 0, ignore it (treat as 1)
        int curr = (root.val == 0) ? 1 : root.val;

        return curr * left * right;
    }
    public static int product(Node root){
        if(root == null) return 1;
        int curr = root.val;
        if(curr == 0){
            curr = 1;
        }
        return curr * product(root.left) * product(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(2);
        Node g = new Node(3);


        a.left  = b; a.right = c;
        b.left  = d; b.right = e;
        c.left  = f; c.right = g;

        int ans = product(a);
        System.out.println("Product of non-zero elements : "+ans);
    }
}