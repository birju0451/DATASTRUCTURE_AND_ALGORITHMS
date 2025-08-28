package Module33_hashmaps_and_hashsets_Part_1;

import java.util.HashMap;

public class Leetcode_3_Largest_SubString {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n;

        int maxLen = 0;
        int i = 0; // left pointer
        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);

            // if character seen and inside current window
            if (map.containsKey(ch) && map.get(ch) >= i) {
                i = map.get(ch) + 1; // jump left pointer
            }

            map.put(ch, j); // update character's latest index
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcga";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 5 ("abcga")
    }
}
