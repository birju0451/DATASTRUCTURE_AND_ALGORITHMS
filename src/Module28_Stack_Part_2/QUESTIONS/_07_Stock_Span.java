package Module28_Stack_Part_2.QUESTIONS;

import java.util.Stack;

public class _07_Stock_Span {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] res = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        res[0] = 1;
        st.push(0);
        for (int i = 1; i < arr.length ; i++) {
            while (st.size()>0 && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.size() == 0) res[i] = i+1;
            else res[i] = i-st.peek();
            st.push(i);
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
