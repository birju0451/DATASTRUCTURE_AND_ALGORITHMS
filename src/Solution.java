import java.util.Scanner;

class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        while (n-- > 1) {
            for (int i = 0; i < n; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }

        return nums[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the array elements
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Create an instance of Solution and compute the triangular sum
        Solution solution = new Solution();
        int result = solution.triangularSum(nums);

        // Output the result
        System.out.println("The triangular sum is: " + result);
    }
}
