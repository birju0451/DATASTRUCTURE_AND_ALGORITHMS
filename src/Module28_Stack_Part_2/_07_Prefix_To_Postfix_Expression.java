package Module28_Stack_Part_2;

import java.util.Stack;

public class _07_Prefix_To_Postfix_Expression {
    public static void main(String[] args) {
        String str = "-9/*+5346";//953+4*6/-
        Stack<String> val = new Stack<>();
        for(int i= str.length()-1; i >= 0 ; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii <= 57){
                val.push(ch+"");
            }else{
                String st1 = val.pop();
                String str2 = val.pop();
                char op = ch;
                //v1 v2 op
                String t = st1 + str2 + op ;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
