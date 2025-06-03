package Module15_Strings;

public class _28_Index_Of_the_First_occurrence {
    public static int StrStr(String haystack, String needle){
        for (int i = 0; i<(haystack.length()-needle.length())+1; i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
                else {
                    return -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(StrStr("badbutsad", "sad"));
    }
}
