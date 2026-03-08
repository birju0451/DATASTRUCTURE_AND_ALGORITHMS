package Module24_Linked_List_part_1;

import java.util.Scanner;

class _12_LinkedListInput {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node temp = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Creating Linked List (Iterative Insertion)
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter next value: ");
            int value = sc.nextInt();
            if(value == -1) break;

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Iterative Traversal
        System.out.println("Linked List:");
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");

        sc.close();
    }
}