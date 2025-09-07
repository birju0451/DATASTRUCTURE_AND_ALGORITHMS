package Module37_Sliding_Window;

public class Leetcode_209_Minimum_Size_Subarray_Sum_Optimal {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        int i = 0, sum = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j]; // expand window

            // shrink window as long as condition is satisfied
            while (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= arr[i];
                i++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        Leetcode_209_Minimum_Size_Subarray_Sum_Optimal obj = new Leetcode_209_Minimum_Size_Subarray_Sum_Optimal();
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(obj.minSubArrayLen(target, arr)); // Output: 2
    }
}
