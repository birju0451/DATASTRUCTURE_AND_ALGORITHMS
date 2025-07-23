package Module30_Binary_Tree_part_1;

public class _07_Levels_Of_Tree {
    public static int Level(Node root){
        if(root == null) return 0;
        int LeftLevel = Level(root.left);
        int RightLevel = Level(root.right);
        return 1+Math.max(LeftLevel, RightLevel);
    }
    public static void Height(Node root){
        System.out.println(Level(root) - 1);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(0);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(Level(a));
        Height(a);
    }
}
