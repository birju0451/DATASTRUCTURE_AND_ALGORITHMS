package Module14_Multidimensional_Array;

public class Transpose1 {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        int m= arr.length,n=arr[0].length;
        //Row wise printing
        System.out.println("row wise printing or original array ");
        for (int i = 0; i < m; i++) {//row line
            for (int j = 0; j < n; j++) {//column line
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("column wise printing or transpose of original array");
        //column wise printing
        for (int j = 0; j < n; j++) {
            for (int i= 0; i < m; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
