package Module15_Strings;
//find the index of the first occurrence inn a string
public class leetcode28Findindexoffirstoccurance {
    public static int strstr(String haystack,String needle){
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,(needle.length()+i)).equals(needle)){
                    return i;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println(strstr("sadbutsad","but"));
    }
}
