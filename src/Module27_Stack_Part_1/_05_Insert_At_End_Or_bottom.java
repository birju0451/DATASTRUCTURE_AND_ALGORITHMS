package Module27_Stack_Part_1;

import java.util.Stack;

public class _05_Insert_At_End_Or_bottom {
    public static void main(String[] args) {
        Stack<Integer> orginal = new Stack<>();
        orginal.push(10);
        orginal.push(20);
        orginal.push(30);
        orginal.push(40);
        System.out.println("The original  stack is : " + orginal);

        Stack<Integer> temp = new Stack<>();
        while(!orginal.isEmpty()){
            int element = orginal.pop();
            temp.push(element);
        }

        int new_element = 50;
        orginal.push(new_element);

        while(!temp.isEmpty()){
            orginal.push(temp.pop());
        }

        System.out.println("After pushing an element at the bottom :"+orginal);
    }
}
