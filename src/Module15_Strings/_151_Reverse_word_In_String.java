package Module15_Strings;

public class _151_Reverse_word_In_String {
    public static String reverseWords(String s){
        String[] word=s.split(" +");//this will separate the string in the word and handle multiple space between the string
        StringBuilder sb=new StringBuilder();
        for (int i = word.length-1; i >= 0 ; i--) {
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println( reverseWords(" the sky  is blue "));
    }
}
