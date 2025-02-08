package Module20_Recursion;

import java.util.ArrayList;

public class subset2 {
    static ArrayList<String> arr=new ArrayList<>();//global attribute
    public static void printSubsets(int i,String s,String ans){
        if(i==s.length()) {
            arr.add(ans);
            return ;
        }
        char ch=s.charAt(i);
        printSubsets(i+1,s,ans);//take
        ans+=ch;
        printSubsets(i+1,s,ans);//not take
    }
    public static void main(String[] args) {
        String s="ab";
        arr=new ArrayList<>();//reset
        printSubsets(0,s,"");
        System.out.println(arr);
    }
}
