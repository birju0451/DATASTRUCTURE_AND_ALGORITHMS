package Module20_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class test {
    public  static void permutation(String ans,String s,ArrayList<String> list){
        if(s.isEmpty()){
            list.add(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            permutation(ans+ch,left+right,list);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = new ArrayList<>();
        permutation("",s,list);
        System.out.println(list);
    }
}
