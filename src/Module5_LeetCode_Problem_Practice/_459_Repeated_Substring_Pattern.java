package Module5_LeetCode_Problem_Practice;

public class _459_Repeated_Substring_Pattern {
    public static boolean checkpattern(String s){
        char ch = s.charAt(0);
        int end = -1;
        int start = 0;

        // find the FIRST repeating position of ch (not the last one)
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch){
                end = i;
                break; // stop at the first repeat
            }
        }

        // if no repeat found, it can't be repeated substring
        if (end == -1) return false;

        int diff = end - start;

        // length must be divisible by diff
        if (s.length() % diff != 0) return false;

        while (end < s.length()) {
            // compare current block with next block
            if (!s.substring(start, end).equals(s.substring(start + diff, end + diff))) {
                return false; // mismatch → not repeated
            }
            start += diff;
            end += diff;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkpattern("abcabcabc")); // true
        System.out.println(checkpattern("abab"));      // true
        System.out.println(checkpattern("aba"));       // false
        System.out.println(checkpattern("aaaa"));      // true
        System.out.println(checkpattern("a"));         // false
    }
}
