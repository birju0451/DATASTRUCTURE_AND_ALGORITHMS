package Module31_Binary_part_2;

import java.util.*;

public class _08_PostOrderTraversal_Iterative_Method2 {
    public static void PostOrderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root != null) st.push(root);
        while (st.size()>0){
            Node top = st.pop();
            ans.add(top.val);
            if(top.left != null) st.push(top.left);
            if(top.right != null) st.push(top.right);
        }
        Collections.reverse(ans);
        for(int ele : ans){
            System.out.print(ele +" ");
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
        PostOrderTraversal(a);
    }
}
