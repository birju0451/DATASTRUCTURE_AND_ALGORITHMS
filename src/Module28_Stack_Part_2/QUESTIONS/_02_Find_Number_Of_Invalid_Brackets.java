package Module28_Stack_Part_2.QUESTIONS;

import java.util.Scanner;
import java.util.Stack;

public class _02_Find_Number_Of_Invalid_Brackets {
    public  static int isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                st.push(ch);
            }
            else{ // ch == ')'
                if(st.isEmpty()) st.push(')');
                else if(st.peek() == ')') st.push(')');
                else if(st.peek() == '(') st.pop();
            }
        }

        return st.size();
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }

}
