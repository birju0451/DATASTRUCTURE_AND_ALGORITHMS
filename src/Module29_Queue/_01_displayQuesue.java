package Module29_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _01_displayQuesue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //rear -> 5 4 3 2 1 -> front
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size() > 0){
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        while(helper.size() > 0){
            q.add(helper.poll());
        }

    }
}
