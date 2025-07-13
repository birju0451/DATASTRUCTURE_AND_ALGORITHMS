package Module28_Stack_Part_2;

import java.util.Stack;

public class _03_Infix_To_prefix_Expression {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix : " + infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s =""+ch;
                val.push(s);
            }else if(op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while(op.peek() != '('){
                    String  v2 = val.pop();
                    String  v1 = val.pop();
                    char o=op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                }
                op.pop();//when the work complete within the bracket remove open bracket
            }
            else {
                if (ch == '+' || ch == '-') {
                    String  v2 = val.pop();
                    String  v1 = val.pop();
                    char o=op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                    //push current operator
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String  v2 = val.pop();
                        String  v1 = val.pop();
                        char o=op.pop();
                        String t = o+v1+v2;
                        val.push(t);
                    }
                    op.push(ch);
                } else {
                    op.push(ch);
                }
            }
        }

        // Final evaluation
        while (val.size() > 1) {
            String  v2 = val.pop();
            String  v1 = val.pop();
            char o=op.pop();
            String t = o+v1+v2;
            val.push(t);
        }
        System.out.println("Prefix: "+val.pop());
    }
}
