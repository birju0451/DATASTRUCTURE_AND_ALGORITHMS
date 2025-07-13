package Module26_Linked_List_Part_3;

class DLL{
    Node head;
    Node tail;
    int size;
    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class _00_doublyLLImplementation {
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(Node node){
        Node temp = node;
        while(temp.prev != null){
            temp = temp.prev;
        }
        // Now temp points at head
        print(temp);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.prev = null;
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = null;

        System.out.print("Forward Print: ");
        print(a);

        System.out.print("Reverse Print: ");
        printReverse(e);

        System.out.print("Display from node c (30): ");
        display(c);

    }
}
