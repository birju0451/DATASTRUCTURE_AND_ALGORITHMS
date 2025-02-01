package Module20_Recursion;

public class subsetofString {
    public static void printSubsets(int i,String s,String ans){
        if(i==s.length()) {
            System.out.println(ans);
            return ;
        }
        char ch=s.charAt(i);
        printSubsets(i+1,s,ans+ch);//take
        printSubsets(i+1,s,ans);//not take
    }
    public static void main(String[] args) {
        String s="abc";
        printSubsets(0,s,"");
    }
}
