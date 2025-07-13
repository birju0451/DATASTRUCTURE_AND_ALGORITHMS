package Module26_Linked_List_Part_3;

class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
/*
* ✅ Node → User-Defined Data Type
It represents a custom data model.
Contains data (val) and links (next, prev).
Just like int, String, or double are built-in types — Node is a custom (user-defined) type for a node.

Example:
java
Node a = new Node(10);  // like creating an 'int' variable, but using your own type

* ✅ DLL → User-Defined Data Structure
It represents the full structure that stores and manages multiple nodes.
It defines how the nodes are linked, accessed, and managed.
You’re organizing logic like head, tail, size, and methods for insertion, deletion, etc.

Example:
java
DLL list = new DLL();  // a full doubly linked list structure

* */