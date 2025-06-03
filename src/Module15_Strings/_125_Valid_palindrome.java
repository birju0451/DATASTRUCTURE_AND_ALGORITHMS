package Module15_Strings;

class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase(); // Convert to lowercase
        StringBuilder sb = new StringBuilder();

        // Keep only alphanumeric characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        // Check if it's a palindrome
        int len = sb.length();
        for (int i = 0; i < len / 2; i++) {
            if (sb.charAt(i) != sb.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public class _125_Valid_palindrome {
    public static void main(String[] args) {
        boolean ans = Solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans); // Expected output: true
    }
}
