package Module29_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _08_ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()){
            st.push(q.poll());
        }

        while (st.size() > 0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
