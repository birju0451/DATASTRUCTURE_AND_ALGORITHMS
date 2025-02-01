package Module20_Recursion;

public class PrintArrayUsingRecursion {
    public static void print(int[] arr,int i){
        if(i==arr.length) return;
        System.out.println(arr[i]);
        print(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,20,30,40,20};
        print(arr,0);
    }
}
