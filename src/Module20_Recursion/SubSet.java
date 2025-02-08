package Module20_Recursion;

public class SubSet {
    public static void printsubset(int i, String s, String ans) {
        if (i == s.length()) {   // Base condition
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);    // Pick current character

        // Exclude current character
        printsubset(i + 1, s, ans);

        // Include current character
        ans += ch;
        printsubset(i + 1, s, ans);
    }

    public static void main(String[] args) {
        String s = "ab";
        printsubset(0, s, "");
    }
}
