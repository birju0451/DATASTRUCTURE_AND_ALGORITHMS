package Module14_Multidimensional_Array;
//for square matrix
public class TransformATranspose {
    public static void print(int[][] matrix){
        int m=matrix.length,n=matrix[0].length;
        for (int i = 0; i < m; i++) {//row line
            for (int j = 0; j < n; j++) {//column line
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("the original array are:-");
        print(matrix);
        int m=matrix.length;//n=matrix[0].length; No need of these part because it is square matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println("the transpose matrix are:- ");
        print(matrix);

    }
}
