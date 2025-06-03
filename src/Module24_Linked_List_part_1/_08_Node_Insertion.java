package Module24_Linked_List_part_1;

class Singly_LL {
    Node head;
    Node tail;
    int size;

    void insertAtBegin(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtMiddle(int idx, int val) {
        if (idx == size) {
            insertAtEnd(val);
            return;
        }
        if (idx == 0) {
            insertAtBegin(val);
            return;
        }
        if (idx > size || idx < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx) throws Error{
        if (idx == size - 1) return tail.val;
        if (idx >= size || idx < 0) {
            throw new Error("bhai code me panga hai kuch");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void setElement(int idx,int val) throws Error{
        if (idx == size - 1)  tail.val=val;
        if (idx >= size || idx < 0) {
            throw new Error("index out of bound");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
    void PrintSize(){
        System.out.println("The size of the linked list is :"+ size);
    }
    void deleteAtHead()throws Error{
        if(head==null){
            throw new Error("list is Empty !");
        }
        head=head.next;
        size--;
    }
    void deleteAtTail(){

    }
    void deleteAtIndex(int idx){
        if(head==null){
            throw new Error("list is Empty !");
        }
        if(idx < 0 || idx >=size ){
            throw new Error("Invalid Index !");
        }
        Node temp = head;
        for (int i = 1; i <= idx-1; i++) {
            temp =temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class _08_Node_Insertion {
    public static void main(String[] args) {
        Singly_LL list = new Singly_LL();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtEnd(42);
        list.insertAtMiddle(2, 1004);
        list.display();

        System.out.println("Size: " + list.size);

        list.insertAtMiddle(2, 104);
        list.display();

        System.out.println("Element at index 3: " + list.getElement(3));
        System.out.println("Element at index 3: " + list.getElement(0));
        list.setElement(3,41);
        list.display();
        list.deleteAtHead();
        list.display();
        list.PrintSize();
        System.out.println();
        list.display();
        list.deleteAtIndex(3);
        list.display();
    }
}
