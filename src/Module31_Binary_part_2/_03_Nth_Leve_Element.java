package Module31_Binary_part_2;

public class _03_Nth_Leve_Element {
    static int n = 0; // target level

    public static void Nth_level1(Node root, int level) { // Preorder
        if (root == null) return;
        if (level == n) System.out.print(root.val + " ");
        Nth_level1(root.left, level + 1);
        Nth_level1(root.right, level + 1);
    }
    public static void Nth_level2(Node root, int level) { // Inorder
        if (root == null) return;
        Nth_level2(root.left, level + 1);
        if (level == n) System.out.print(root.val + " ");
        Nth_level2(root.right, level + 1);
    }
    public static void Nth_level3(Node root, int level) { // Postorder
        if (root == null) return;
        Nth_level3(root.left, level + 1);
        Nth_level3(root.right, level + 1);
        if (level == n) System.out.print(root.val + " ");
    }
    public static void Nth_level4(Node root, int level) { // Reverse Preorder
        if (root == null) return;
        if (level == n) System.out.print(root.val + " ");
        Nth_level4(root.right, level + 1);
        Nth_level4(root.left, level + 1);
    }
    public static void Nth_level5(Node root, int level) { // Reverse Inorder
        if (root == null) return;
        Nth_level5(root.right, level + 1);
        if (level == n) System.out.print(root.val + " ");
        Nth_level5(root.left, level + 1);
    }
    public static void Nth_level6(Node root, int level) { // Reverse Postorder
        if (root == null) return;
        Nth_level6(root.right, level + 1);
        Nth_level6(root.left, level + 1);
        if (level == n) System.out.print(root.val + " ");
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

        System.out.println("Different ways to print Nth level elements:");
        System.out.print("Preorder: ");
        Nth_level1(a, 0);  System.out.println();
        System.out.print("Inorder: ");
        Nth_level2(a, 0);  System.out.println();
        System.out.print("Postorder: ");
        Nth_level3(a, 0);  System.out.println();
        System.out.print("Reverse Preorder: ");
        Nth_level4(a, 0); System.out.println();
        System.out.print("Reverse Inorder: ");
        Nth_level5(a, 0); System.out.println();
        System.out.print("Reverse Postorder: ");
        Nth_level6(a, 0); System.out.println();
    }
}
