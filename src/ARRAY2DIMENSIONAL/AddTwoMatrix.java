package ARRAY2DIMENSIONAL;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] a={{1,1,1},{1,1,1},{1,1,1}};
        int[][] b={{2,2,2},{2,2,2},{2,2,2}};
//        int[][] c=new int[a.length][a[0].length];
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print((a[i][j]=a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }
    }
}
