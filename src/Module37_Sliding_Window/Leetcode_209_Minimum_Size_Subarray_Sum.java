package Module37_Sliding_Window;

public class Leetcode_209_Minimum_Size_Subarray_Sum {
    public static  int minSubArrayLen(int target, int[] arr) {
        int n = arr.length,minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0,j=i;
            while (j<n && sum<target){
                sum += arr[j];
                j++;
            }
            int len = j-i+1;
            minLen = Math.min(minLen,len);
        }
        if(minLen == Integer.MIN_VALUE) return 0;
        return minLen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,arr));
    }
}
