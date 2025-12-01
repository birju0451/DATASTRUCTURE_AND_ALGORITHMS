package test;
class Node{
    int val;
    Node left;
    Node right;
    Node root;
    Node(int val){
        this.val = val;
    }

}
public class practiceNode_Creation {
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int product(Node root){
        if(root == null) return 1;
        int  leftProduct= product(root.left);
        int rightProduct = product(root.right);
        return root.val * leftProduct * rightProduct;
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+ size(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(10);
        Node d = new Node(0);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println("Element in the Tree");
        display(a);
        System.out.println();
        System.out.println("Sum of element in the Tree");
        System.out.println(sum(a));
        System.out.println("Product of element in the Tree");
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(size(a));
    }
}
