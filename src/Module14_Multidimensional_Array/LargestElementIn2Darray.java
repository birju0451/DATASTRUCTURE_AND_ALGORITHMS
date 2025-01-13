package Module14_Multidimensional_Array;

public class LargestElementIn2Darray {
    public static void main(String[] args) {
        int[][] arr={{4,5,6},{1,2,3},{70,5,8}};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        System.out.println("the maximum element in arr is"+max);
    }
}
