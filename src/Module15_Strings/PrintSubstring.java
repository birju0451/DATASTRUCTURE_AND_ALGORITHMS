package Module15_Strings;

public class PrintSubstring {
    public static void main(String[] args) {
        String s="abcde";

        for (int i = 0; i <= s.length(); i++) {
            String p="";
            for (int j = i+1; j <= s.length(); j++) {
                p=s.substring(i,j);
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
