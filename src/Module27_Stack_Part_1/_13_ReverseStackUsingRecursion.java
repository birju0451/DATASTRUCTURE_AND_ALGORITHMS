package Module27_Stack_Part_1;
import java.util.Stack;
public class _13_ReverseStackUsingRecursion{
    private static void insertAtBottom(Stack<Integer> st, int top){
        if(st.isEmpty()){
            st.push(top);
            return;
        }
        int ele = st.pop();
        insertAtBottom(st,top);
        st.push(ele);
    }

    private static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st,top);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
