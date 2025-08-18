package Module32_Binary_Search_Tree;

public class _01_Maximum_And_Minimum_of_BST {
    static int min;
    static int max;
    public static void minimum(Node root){
        if(root.left == null){
            min =  root.val;
            return;
        }
        minimum(root.left);
    }
    public static void maximum(Node root){
        if(root.right == null){
            max = root.val;
            return;
        }
        maximum(root.right);
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        minimum(a.left);
        System.out.println("Minimum element :"+min);
        maximum(a.right);
        System.out.println("Maximum element :"+max);
    }
}
