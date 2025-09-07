package Module37_Sliding_Window;

public class _04_Maximum_Sum_SubArray_SizeK_Optimal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 10};
        int k = 2;
        int n = arr.length;

        int maxSum = 0;

        // Brute force approach (O(n*k))
        /*
        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = i; j <= i + k - 1; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        */

        // Sliding window approach (O(n))
        int i = 0, j = k - 1, sum = 0;
        for (int a = 0; a < k; a++) { // first k elements
            sum += arr[a];
        }
        maxSum = sum;

        i++;
        j++;

        while (j < n) { // sliding window
            sum = sum - arr[i - 1] + arr[j];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }

        System.out.println(maxSum);
    }
}
