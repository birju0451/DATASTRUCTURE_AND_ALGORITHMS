package Module31_Binary_part_2;

import java.util.LinkedList;
import java.util.Queue;

public class _05_LevelOrderTraversal_With_LevelPair {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node , int level){
            this.level = level;
            this.node = node;
        }
    }
    public static void levelordertraversal(Node root){
        int prevlevel=0;
        Queue<Pair> q = new LinkedList<>();
        Pair p = new Pair(root,0);
        if(root != null) q.add(p);
        while(q.size() > 0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl != prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val + " ");
            if(temp.left != null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right != null) q.add(new Pair(temp.right,lvl+1));

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
        levelordertraversal(a);
    }
}
