package Module27_Stack_Part_1;

public class _12_LinkedList_Implementation {
    public static class Node{ //user define data type
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next = null;
        }
    }
    public static class LLStack{//user define data structure
        Node head = null;
        int size = 0;

        void  push(int x){
           Node temp = new Node(x);
           temp.next = head;
           head = temp;
           size++;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return  x;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h){
            if(h == null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayReverse(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){//getter
            return size;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(50);
        st.push(60);
        System.out.println(st.size());
        st.push(70);
    }
}
