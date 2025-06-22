package Module27_Stack_Part_1;

import java.util.Stack;

public class _06_Insert_At_AnyIndex {
    public static void main(String[] args) {
        Stack<Integer> orginal = new Stack<>();
        orginal.push(10);
        orginal.push(20);
        orginal.push(30);
        orginal.push(40);
        System.out.println("The original  stack is : " + orginal);
        int index = 2 ,new_element = 50;
        Stack<Integer> temp = new Stack<>();
        while(orginal.size() >= index){
            int element = orginal.pop();
            temp.push(element);
        }
        orginal.push(new_element);

        while(!temp.isEmpty()){
            orginal.push(temp.pop());
        }

        System.out.println(orginal);
    }
}
