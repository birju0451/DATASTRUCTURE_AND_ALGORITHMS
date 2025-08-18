package Module31_Binary_part_2;

import java.util.Stack;

public class _07_PostOrderTraversal_Iterative_Method1 {
    public static void PostOrderTraversal(Node root,Stack<Integer> stack ){
        Stack<Node> st = new Stack<>();

        if(root != null) st.push(root);
        while (st.size()>0){
            Node top = st.pop();
            stack.push(top.val);
            if(top.left != null) st.push(top.left);
            if(top.right != null) st.push(top.right);
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
        System.out.println("Postorder Traversal iterative method:");
        Stack<Integer> stack = new Stack<>();
        PostOrderTraversal(a ,stack);
        while(stack.size()>0){
            System.out.print(stack.pop()+" ");
        }
    }
}
