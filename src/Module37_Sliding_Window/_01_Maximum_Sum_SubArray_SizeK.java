package Module37_Sliding_Window;

public class _01_Maximum_Sum_SubArray_SizeK {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,3};
        int k = 3;
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i<n-k+1; i++) {
            int sum = 0;
            for(int j=i;j<=i+k-1;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
