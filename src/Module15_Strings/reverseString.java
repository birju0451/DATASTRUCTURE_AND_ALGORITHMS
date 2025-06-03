package Module15_Strings;

public class reverseString {
    public static void main(String[] args) {
        String str="Level";
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev=rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("The string is palindrome");
        }else {
            System.out.println("Thr string is not palindrome ");
        }
    }
}
