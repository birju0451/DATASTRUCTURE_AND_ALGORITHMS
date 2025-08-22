package Module32_Binary_Search_Tree;

public class inorder_Predecessor_Successor {
    static int predecessor = -1;
    static int sucessor= -1;
    static int prev = -1;

    // Function to find inorder predecessor of a given key
    public static void inorderPredecessor(Node root, int key) {
        if(root == null) return;
        inorderPredecessor(root.left, key);
        if(root.val == key) {
            predecessor = prev;   // predecessor is last visited node
        }
        prev = root.val;  // update prev
        inorderPredecessor(root.right, key);
    }
    public static void inordersucessor(Node root, int key) {
        if(root == null) return;
        inordersucessor(root.left, key);

        if(prev== key) {
           sucessor= root.val;   // predecessor is last visited node
        }
        prev = root.val;  // update prev
        inordersucessor(root.right, key);
    }


    public static void main(String[] args) {
        Node a = new Node(40);
        Node b = new Node(20);
        Node c = new Node(60);
        Node d = new Node(10);
        Node e = new Node(30);
        Node f = new Node(50);
        Node g = new Node(70);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        inorderPredecessor(a, 50);
        System.out.println("Predecessor: " + predecessor);
        inordersucessor(a, 50);
        System.out.println("Sucessor: " + sucessor);

    }
}
