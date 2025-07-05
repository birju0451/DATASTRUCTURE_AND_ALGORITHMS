package Module27_Stack_Part_1;

import java.util.Stack;

public class _07_Reverse_Stack_Recursively {
    public static void  displayRec(Stack<Integer> org){
        if(org.isEmpty()) return;
        int top =  org.pop();
//        System.out.println(top);
        displayRec(org);
        System.out.println(top);
        org.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);
        System.out.println("The original stack is :" + original);
        System.out.println("Reverse stack is : ");
        displayRec(original);
        System.out.println("The original stack is :" + original);
    }
}
