package Module32_Binary_Search_Tree;
public class _03_Inorder_Traversal {
    static int sum;
    public static void Inorder(Node root){
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }
    public static void Reverse_inorder(Node root){
        if(root == null) return;
        Reverse_inorder(root.right);
        System.out.print(root.val);
        Reverse_inorder(root.left);

    }
    public static void Reverse_inorder_Update1(Node root){
        if(root == null) return;
        Reverse_inorder_Update1(root.right);

        System.out.print((root.val + 1)+" ");
        Reverse_inorder_Update1(root.left);

    }
    public static void Reverse_inorder_Update(Node root){
        if(root == null) return;
        Reverse_inorder_Update(root.right);
        sum = sum + root.val;
        root.val = sum;
        System.out.print(root.val+" ");
        Reverse_inorder_Update(root.left);

    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(6);
        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(5);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println("Inorder of BST");
        Inorder(a);
        System.out.println("\nReverse inorder of BST");
        Reverse_inorder(a);
        System.out.println("\nReverse inorder update by 1 of BST");
        Reverse_inorder_Update1(a);
        System.out.println("\nReverse inorder update by greate sum  of BST");
        Reverse_inorder_Update(a);
        System.out.println("\nthe value of a ="+a.val);
    }
}
