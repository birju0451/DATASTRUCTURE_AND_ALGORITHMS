package Module28_Stack_Part_2;

import java.util.Stack;

public class _08_Postfix_To_Prefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";// -9/*+5346
        Stack<String> val = new Stack<>();
        for(int i= 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii <= 57){
                val.push(ch+"");
            }else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                //v1 v2 op
                String t =op + v1 + v2 ;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
