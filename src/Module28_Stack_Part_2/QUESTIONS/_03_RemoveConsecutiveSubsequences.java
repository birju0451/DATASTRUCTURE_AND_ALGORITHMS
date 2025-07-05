package Module28_Stack_Part_2.QUESTIONS;

import java.util.Stack;

public class _03_RemoveConsecutiveSubsequences {

    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }

        int[] result = new int[st.size()];
        int m = result.length;

        for (int i = m - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        int[] res = remove(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
