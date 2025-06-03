package Module24_Linked_List_part_1;

class SLL{
    private   Node head;
    private Node tail;
    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next = temp;
            tail=temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
    }
    void size(){
        System.out.println("Length of the linked list is : "+ size);
    }

}
public class _05_Node_Insert_At_End {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
        System.out.println();
        System.out.println("Again insert :");
        list.insertAtEnd(83);
        list.insertAtEnd(53);
        list.display();

        System.out.println("\n"+list.size);
        //or
        list.size();

    }
}
