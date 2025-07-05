package Module28_Stack_Part_2.QUESTIONS;

import java.util.Scanner;
import java.util.Stack;

public class _06_Previous_Greatest_element {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] res = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
