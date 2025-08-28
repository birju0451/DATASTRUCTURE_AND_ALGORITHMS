package Module18_Basic_Sorting_Algorithms;

public class _01_CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {25,5,34,53,32,50,30};
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i+1]<arr[i]){
                flag = false;
            }
        }
       if(flag){
           System.out.println("Array is sorted");
       }else{
           System.out.println("Array is not sorted");
       }
    }
}
