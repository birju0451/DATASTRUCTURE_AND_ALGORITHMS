package Module15_Strings;

public class leetcode151ReverseWordsinString {
    public static String reverseword(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for (int i = words.length-1; i >=0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseword(" the sky  is blue "));
    }
}
