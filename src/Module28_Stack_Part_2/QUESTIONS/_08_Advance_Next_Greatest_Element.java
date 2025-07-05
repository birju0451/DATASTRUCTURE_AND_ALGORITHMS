package Module28_Stack_Part_2.QUESTIONS;

import java.util.Stack;

public class _08_Advance_Next_Greatest_Element {
    public static void main(String[] args) {
       int[] arr = {1,5,2,1,6,3,4};
       int[] res = new  int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (st.size()>0 && arr[st.peek()]<arr[i]){
                res[st.pop()] = arr[i];
            }
            if(st.size() == 0) st.push(i);
            if(arr[i]<arr[st.peek()]) st.push(i);
        }
        for (int i = 0; i < res.length; i++) {
            if(res[i] !=0){
                System.out.print(res[i]+" ");
            }else{
                res[i] = -1;
                System.out.print(res[i]+" ");
            }
        }
    }
}
