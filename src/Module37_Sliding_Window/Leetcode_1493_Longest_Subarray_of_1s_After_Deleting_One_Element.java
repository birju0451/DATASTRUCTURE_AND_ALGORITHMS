package Module37_Sliding_Window;

public class Leetcode_1493_Longest_Subarray_of_1s_After_Deleting_One_Element {
    public int longestSubarray(int[] arr) {
        int n = arr.length, i = 0, j = 0;
        int z = 0;
        for (int ele : arr) {
            if (ele == 0) z++;
        }
        if (z == 0) return n - 1; // I am removing a '1'
        int zeroes = 0, maxLen = 0;
        while (i < n && arr[i] == 0) i++;
        if (i == n) return 0;
        j = i;
        while (j < n) {
            if (arr[j] == 1) {
                j++;
            } else { // arr[j] == 0
                if (zeroes == 0) {
                    j++;
                    zeroes++;
                } else { // zeroes == 1
                    int len = j - i - 1;
                    maxLen = Math.max(maxLen, len);
                    j++;
                    while (i < n && arr[i] == 1) i++;
                    i++;
                }
            }
        }
        if (zeroes == 0) return j - i;
        int len = j - i - 1;
        maxLen = Math.max(maxLen, len);
        return maxLen;
    }
    public static void main(String[] args) {
        Leetcode_1493_Longest_Subarray_of_1s_After_Deleting_One_Element obj = new Leetcode_1493_Longest_Subarray_of_1s_After_Deleting_One_Element();

        int[] arr1 = {1,1,0,1};
        int[] arr2 = {0,1,1,1,0,1,1,0,1};
        int[] arr3 = {1,1,1};
        int[] arr4 = {0,0,0};

        System.out.println(obj.longestSubarray(arr1)); // 3
        System.out.println(obj.longestSubarray(arr2)); // 5
        System.out.println(obj.longestSubarray(arr3)); // 2
        System.out.println(obj.longestSubarray(arr4)); // 0
    }
}
