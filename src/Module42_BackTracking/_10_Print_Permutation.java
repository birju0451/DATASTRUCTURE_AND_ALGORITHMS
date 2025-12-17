package Module42_BackTracking;

import java.util.ArrayList;
public class _10_Print_Permutation{
    public static void printPermutations(String ans,String s,ArrayList<String> list){
        if(s.length()==0){
            list.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            printPermutations(ans+ch,left+right,list);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = new ArrayList<>();
        printPermutations("",s,list);
        System.out.println(list);
    }
}
