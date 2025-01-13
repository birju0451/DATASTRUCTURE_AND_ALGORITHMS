package Module14_Multidimensional_Array;

public class RotateArrayBy90 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("original array ");
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print((a[i][j])+" ");
            }
            System.out.println();
        }
        int m=a.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        System.out.println("transpose array");
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print((a[i][j])+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length ; i++) {
            int x=0,y=m-1;
            while(x<=y){
                int temp=a[i][x];
                a[i][x]=a[i][y];
                a[i][y]=temp;
                x++;
                y--;
            }
        }
        System.out.println("rotated array");
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print((a[i][j])+" ");
            }
            System.out.println();
        }

    }
}
