package Module29_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _10_Reverse_K_Element_In_Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n = q.size();
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        int k = 3;
        for (int i = 0; i < k ; i++) {
            st.push(q.poll());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }
        System.out.println(q);
        for (int i = 0; i < n-k; i++) {
            q.add(q.poll());
        }
        System.out.println(q);
    }
}
