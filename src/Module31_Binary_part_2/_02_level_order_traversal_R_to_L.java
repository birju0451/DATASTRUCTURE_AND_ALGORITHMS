package Module31_Binary_part_2;

import java.util.LinkedList;
import java.util.Queue;

public class _02_level_order_traversal_R_to_L {
    public static void levelordertraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size() > 0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.right != null) q.add(front.right);
            if(front.left != null) q.add(front.left);

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
        System.out.println("Level order traversal :");
        levelordertraversal(a);
    }
}
