package Module27_Stack_Part_1;

import java.util.Stack;

public class _03_Reverse_Stack_Same_Order {
    public static void main(String[] args) {
        Stack<Integer> st_org = new Stack<>();
        st_org.push(10);
        st_org.push(20);
        st_org.push(30);
        st_org.push(40);
        System.out.println("The original  stack is : " + st_org);

        Stack<Integer> st_temp = new Stack<>();
        while(!st_org.isEmpty()){
            int element = st_org.pop();
            st_temp.push(element);
        }

        System.out.println("The temporary stack is : "+st_temp);

        Stack<Integer> st_rev = new Stack<>();
        while(!st_temp.isEmpty()){
            int element = st_temp.pop();
            st_rev.push(element);
        }

        System.out.println("The reverse   stack is i: "+st_rev);
    }
}
