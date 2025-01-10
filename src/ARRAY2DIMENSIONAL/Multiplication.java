package ARRAY2DIMENSIONAL;

public class Multiplication {
    public static void print(int[][] matrix){
        int m=matrix.length,n=matrix[0].length;
        for (int i = 0; i < m; i++) {//row line
            for (int j = 0; j < n; j++) {//column line
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] a={{1,2,1},{2,1,2}};
        int[][] b={{1,0,1,2},{2,1,0,0},{0,3,0,0}};
        if(a[0].length!=b.length){
            System.out.println("multiplication is not possible !");
        }else
        {
            int[][] c=new int[a.length][b[0].length];
            for (int i = 0; i < a.length ; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    //c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j]+...;
                    for (int k=0;k<a[0].length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                    //System.out.print(c[i][j]+" ");
                }
                //System.out.println();
            }
            print(a);
            print(b);
            print(c);
        }
    }
}
