package Module31_Binary_part_2;

public class _04_Nth_level_order_Traversal {
    static int n ;
    /*we are printing the level of element by the help of preorder if we use IN and POST
    the answer will become same */
    public static void Nth_level(Node root ,int level){
        if(root == null) return ;
        if(level == n) System.out.println(root.val);
        Nth_level(root.left ,level+1);
        Nth_level(root.right ,level+1);
    }
    public static void main(String[] args) {
        // Level 0
        Node a = new Node(1);

        // Level 1
        Node b = new Node(2);
        Node c = new Node(3);

        // Level 2
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        // Level 3
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);
        Node m = new Node(13);
        Node n1 = new Node(14);
        Node o = new Node(15);

        // Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = h; d.right = i;
        e.left = j; e.right = k;
        f.left = l; f.right = m;
        g.left = n1; g.right = o;
        System.out.println("Nth level element printing :");
        for(int x = 0;x<=3 ; x++){
            n = x;
            Nth_level(a,0);
            System.out.println();
        }

    }
}
