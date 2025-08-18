package Module31_Binary_part_2;

import java.util.Stack;

public class _09_InOrderTraversal_Iterative_Method {
    public static void InOrderTraversal(Node root) {
        Stack<Node> st = new Stack<>();
        Node temp = root;

        while (temp != null || !st.isEmpty()) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left; // go left
            } else {
                Node top = st.pop();
                System.out.print(top.val + " ");
                temp = top.right; // then go right
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println("Inorder Traversal iterative method:");
        InOrderTraversal(a);
    }
}
