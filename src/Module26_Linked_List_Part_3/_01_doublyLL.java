package Module26_Linked_List_Part_3;

class Doubly_ink_list { // user-defined data structure
    Node head;
    Node tail;
    int size = 0;

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = tail;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insetAtIndex(int idx ,int val){
       if(idx == 0){
           insertAtHead(val);
           return;
       }
       if(idx == size){
           insertAtTail(val);
           return;
       }
       if(idx >size || idx < 0){
           System.out.println("Invalid index");
           return;
       }
       Node temp = new Node(val);
       Node x = head;
        for (int i = 1; i <=idx-1 ; i++) {
            x = x.next;
        }
        Node y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }
    //Deletion:---
    void deleteAtHead() throws Error{
        if(head == null) throw new Error("List is Empty");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail() throws Error{
        if(size == 0) throw new  Error("List is Empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteAtIndex(int idx){
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size-1){
            deleteAtTail();
            return;
        }
        if(idx < 0 && idx >size){
            System.out.println("Invalid index");
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;

        temp.prev = temp.prev.prev;
        size--;

    }

}

public class _01_doublyLL {
    public static void main(String[] args) {
        Doubly_ink_list list = new Doubly_ink_list();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display(); // Output: 10 20 30
        list.insertAtTail(40);
        list.display();
        list.insertAtHead(7);
        list.insertAtHead(5);
        list.display();
        list.insetAtIndex(5,1000);
        list.display();
        list.deleteAtIndex(3);
        list.display();
        System.out.println("Tail: " + list.tail.val); // Output: Tail: 30
        System.out.println("Size: " + list.size);      // Output: Size: 3
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