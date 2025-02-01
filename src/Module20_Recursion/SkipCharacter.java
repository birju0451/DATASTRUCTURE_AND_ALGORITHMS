package Module20_Recursion;

public class SkipCharacter {
        public static void skip(String s,int i,String ans){
            if(i==s.length()) {
                System.out.println(ans);
                return;
            }
            if(s.charAt(i)!='a') ans+=s.charAt(i);
            skip(s,i+1,ans);
        }
        public static void main(String[] args) {
            String s = "Raghav garg";
            String ans="";
           skip(s,0,ans);
        }
}
