package Module30_Binary_Tree_part_1;

import java.util.*;
public class userInputTree {
    // Preorder
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    // Postorder
    public static void display1(Node root){
        if(root == null) return;
        display1(root.left);
        display1(root.right);
        System.out.print(root.val + " ");
    }

    // Build tree using level-order input
    public static Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root value (-1 for null): ");
        int rootVal = sc.nextInt();

        if(rootVal == -1) return null;

        Node root = new Node(rootVal);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node curr = q.poll();

            System.out.print("Enter left child of " + curr.val + " (-1 for null): ");
            int left = sc.nextInt();
            if(left != -1) {
                curr.left = new Node(left);
                q.add(curr.left);
            }

            System.out.print("Enter right child of " + curr.val + " (-1 for null): ");
            int right = sc.nextInt();
            if(right != -1) {
                curr.right = new Node(right);
                q.add(curr.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = buildTree();

        System.out.println("\nPreorder Traversal:");
        display(root);

        System.out.println("\nPostorder Traversal:");
        display1(root);
    }
}
