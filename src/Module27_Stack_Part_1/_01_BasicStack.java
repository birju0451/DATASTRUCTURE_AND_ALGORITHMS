package Module27_Stack_Part_1;

import java.util.Stack;

public class _01_BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());

        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        //operation on stack
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println("Size of stack is : " + st.size() );
        System.out.println(st);

        st.push(10);
        st.push(20);
        System.out.println(st);

        //to access the first element
        while(st.size() > 1){
            st.pop();
        }
        //now size has been 1
        System.out.println(st.peek());
    }
}
