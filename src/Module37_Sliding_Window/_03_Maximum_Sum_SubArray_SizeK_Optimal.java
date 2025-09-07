package Module37_Sliding_Window;

public class _03_Maximum_Sum_SubArray_SizeK_Optimal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 3};
        int k = 3;
        int n = arr.length;

        // Initial sum of first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        int i = 1, j = i + k - 1;

        // Sliding window
        while (j < n) {
            sum = sum - arr[i - 1] + arr[j]; // subtract outgoing, add incoming
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }

        System.out.println(maxSum);
    }
}
