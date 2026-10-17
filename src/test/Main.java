package test;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] input = {1,3,2,1,8,6,3};
        int n = input.length;
        int[] result = new int[n];
        Stack<Integer> st =new Stack<>();
        st.push(input[n-1]);
        result[n-1] = input[n-1];
        for(int i = n-2; i >=0 ; i--){
            if(st.peek() >input[i]){
                input[i] = st.peek();

            }
            while(!st.isEmpty() && st.peek() < input[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(input[i]);
            }
        }
    }
}
