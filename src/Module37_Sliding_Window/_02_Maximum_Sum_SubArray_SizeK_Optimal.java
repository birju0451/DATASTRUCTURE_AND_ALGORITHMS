package Module37_Sliding_Window;

public class _02_Maximum_Sum_SubArray_SizeK_Optimal{
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 3};
        int k = 3;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int MaxSum = sum;
        for (int i = 1, j = i + k - 1; j < n; i++, j++) {
            sum = sum - arr[i - 1] + arr[j];
            MaxSum = Math.max(sum, MaxSum);
        }
        System.out.println(MaxSum);
    }
}
