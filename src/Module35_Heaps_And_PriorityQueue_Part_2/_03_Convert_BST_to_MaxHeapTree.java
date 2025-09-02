package Module35_Heaps_And_PriorityQueue_Part_2;

import java.util.ArrayList;
import java.util.List;

public class _03_Convert_BST_to_MaxHeapTree {
    public static class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    // Step 1: Reverse Inorder (get descending order directly)
    public static void Reverse_inorder(Node root, List<Integer> arr) {
        if (root == null) return;
        Reverse_inorder(root.right, arr);
        arr.add(root.val);
        Reverse_inorder(root.left, arr);
    }

    // Step 2: Preorder traversal to assign values from list
    static int idx = 0;
    public static void PreorderFeeling(Node root, List<Integer> arr) {
        if (root == null) return;
        root.val = arr.get(idx++);
        PreorderFeeling(root.left, arr);
        PreorderFeeling(root.right, arr);
    }

    // Utility: Preorder print
    public static void preorderPrint(Node root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preorderPrint(root.left, res);
        preorderPrint(root.right, res);
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(6);
        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(5);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        // Step 1: Collect values in descending order
        List<Integer> arr = new ArrayList<>();
        Reverse_inorder(a, arr);
        System.out.println("Descending order from BST: " + arr);

        // Step 2: Assign values in Preorder fashion
        idx = 0;
        PreorderFeeling(a, arr);

        // Step 3: Print Preorder of Max Heap
        List<Integer> result = new ArrayList<>();
        preorderPrint(a, result);
        System.out.println("Max Heap Preorder: " + result);
    }
}
