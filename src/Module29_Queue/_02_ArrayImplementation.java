package Module29_Queue;

import java.security.PublicKey;
import java.util.Queue;

public class _02_ArrayImplementation {
    public static   class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];
        public void add(int val){
           if( r == arr.length-1){
               System.out.println("Queue is full!");
               return;
           }
           if(f == -1){
               f = r = 0;
               arr[r]=val;
           }else{
               arr[++r] = val;
           }
           size++;
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public void peek(){
            if(size == 0){
                System.out.println("Queue is Empty !");
                return;
            }
            System.out.println(arr[f]);
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
            }else{
                for (int i = f; i <=r; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(10);
        q.add(20);
        q.add(20);
        q.add(20);
        q.display();
        q.remove();
        q.display();
        q.peek();
        System.out.println(q.size);
    }
}
