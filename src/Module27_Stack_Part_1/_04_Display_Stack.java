package Module27_Stack_Part_1;

import java.util.Stack;

public class _04_Display_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("The stack is : " + st);//time complexity is O(N)
        System.out.println("\nElement one by one :");
        while(!st.isEmpty()){//time complexity is O(N)
            System.out.println(st.pop());
        }
    }
}
