package Module33_hashmaps_and_hashsets_Part_1.HashSet;

import java.util.HashSet;

public class _05_Maximum_Number_Of_String_Pair_2744 {
    public static int maximum_String_Pair(String[] words){
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(String word : words){
            String rev = new StringBuilder(word).reverse().toString();
            if(set.contains(rev)){
                count++;
            }
            else {
                set.add(word);
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String[] words = {"cd","ac","dc","ca","zz"};
       int ans = maximum_String_Pair(words);
        System.out.println(ans);
    }
}
