package Module37_Sliding_Window;

public class Leetcode_1493_Longest_Subarray_of_1s_After_Deleting_One_Element2 {
    public int longestSubarray(int[] arr) {
        int n = arr.length, i = 0, j = 0;
        int z = 0;

        // Count zeroes in the array
        for (int ele : arr) {
            if (ele == 0) z++;
        }
        // If there are no zeroes, the longest subarray is n - 1 (must remove one element)
        if (z == 0) return n - 1;

        int zeroes = 0, maxLen = 0;

        // Move i to the first 1 in the array (skip leading zeroes)
        while (i < n && arr[i] == 0) i++;
        // If the whole array is zeroes, no such subarray is possible
        if (i == n) return 0;

        j = i; // Set j to the start of the first sequence of 1's

        // Sliding window starts here
        while (j < n) {
            if (arr[j] == 1) {
                // Expand window to the right as long as we see 1's
                j++;
            } else { // arr[j] == 0
                if (zeroes == 0) {
                    // First zero in the window: include it and continue
                    j++;
                    zeroes++;
                } else {
                    // We already have one zero: time to check and possibly shrink the window
                    int len = j - i - 1; // Exclude the zero
                    maxLen = Math.max(maxLen, len);
                    j++;
                    // Move i right past the first zero in window, skipping consecutive 1's
                    while (i < n && arr[i] == 1) i++;
                    i++; // Move past the zero
                }
            }
        }

        // After loop, check if there was no zero in the window
        if (zeroes == 0) return j - i;
        int len = j - i - 1;
        maxLen = Math.max(maxLen, len);

        return maxLen;
    }
    public static void main(String[] args) {

    }
}
