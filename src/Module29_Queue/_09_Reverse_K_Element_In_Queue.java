package Module29_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _09_Reverse_K_Element_In_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        int k = 3;
        for (int i = 0; i <k ; i++) {
            st.push(q.poll());
        }
        Queue<Integer> q1 = new LinkedList<>();
        while (st.size() > 0){
            q1.add(st.pop());
        }
        while (q.size() > 0){
            q1.add(q.poll());
        }
        System.out.println(q1);
    }
}
