package Module32_Binary_Search_Tree;

public class _02_Maximum_And_Minimum_Of_BST {
    public static void minimum(Node root,int[] arr){
        if(root.left == null){
            arr[0]=  root.val;
            return;
        }
        minimum(root.left,arr);
    }
    public static void maximum(Node root,int[] arr){
        if(root.right == null){
            arr[0] = root.val;
            return;
        }
        maximum(root.right,arr);
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
        int[] min = {0};
        minimum(a.left,min);
        System.out.println("Minimum element :"+min[0]);
        int[] max = {0};
        maximum(a.right,max);
        System.out.println("Maximum element :"+max[0]);
    }
}
