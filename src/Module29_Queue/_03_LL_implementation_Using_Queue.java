package Module29_Queue;

public class _03_LL_implementation_Using_Queue{
     public static class Node{
        int val;
        Node next;
        Node tail;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
         Node head = null;
         Node tail = null;
         int size = 0;
         public void add(int x){
             Node temp = new Node(x);
             if(size == 0){
                 head=tail = temp;
             }else{
                tail.next = temp;
                tail = temp;
             }
             size++;
         }
         public int peek(){
             if(size == 0) {
                 System.out.println("Queue is Empty !");
                 return -1;
             }
             return head.val;
         }
         public int remove(){
             if(size == 0) {
                 System.out.println("Queue is Empty !");
                 return -1;
             }
             int x = head.val;
             head  = head.next;
             size--;
             return x;
         }
         public void display(){
             Node temp = head;
             if(size == 0){
                 System.out.println("Queue is Empty !");
                 return;
             }
             while(temp != null){
                 System.out.print(temp.val+" -> ");
                 temp = temp.next;
             }
             System.out.print("null"+"\n");
         }
         public boolean isEmpty(){
             if(size == 0) return true;
             else return false;
         }
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.display();
        q.add(10);
        q.add(20);
        System.out.println(q.isEmpty());
        q.add(30);
        q.add(40);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();

    }
}
