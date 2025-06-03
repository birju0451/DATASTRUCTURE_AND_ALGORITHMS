package Module15_Strings;

public class _58_length_Of_the_Last_Word {
    public  static int LengthOfLastWord(String s){
        String str =s.trim();
        int count=0;
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i)!=' ') count++;
            else break;
        }
        return count;
    }
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(LengthOfLastWord(s));
    }
}
