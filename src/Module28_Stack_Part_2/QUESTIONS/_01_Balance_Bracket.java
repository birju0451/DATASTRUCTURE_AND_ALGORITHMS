package Module28_Stack_Part_2.QUESTIONS;

import java.util.Scanner;
import java.util.Stack;

public class _01_Balance_Bracket {
    public  static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                st.push(ch);
            }
            else{ // ch == ')'
                if(st.isEmpty()) return false;
                if(st.peek() == '(') st.pop();
            }
        }

        if(st.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }


}
