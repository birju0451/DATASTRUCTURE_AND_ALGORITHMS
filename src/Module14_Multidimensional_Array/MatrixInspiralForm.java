package Module14_Multidimensional_Array;

public class MatrixInspiralForm {
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
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int m= arr.length,n=arr[0].length;
        print(arr);
        System.out.println("spiral form");
        //spiral printing
        int minR=0,maxR=m-1;
        int minC=0,maxC=n-1;
        while(minR<=maxR && minC<=maxC){
            //Left to Right
            for(int j=minC;j<=maxC;j++){
                System.out.print(arr[minR][j]+" ");
            }minR++;
            //top to bottom;
            if(minR>maxR || minC>minR) break;
            for(int i=minR;i<=maxR;i++){
                System.out.print(arr[i][maxC]+" ");
            }maxC--;
            //Right to left
            if(minR>maxR || minC>minR) break;
            for(int j=maxC;j>=minC;j--){
                System.out.print(arr[maxR][j]+" ");
            }maxR--;
            //bottom to top;
            if(minR>maxR || minC>minR) break;
            for(int i=maxR;i>=minR;i--){
                System.out.print(arr[i][minC]+" ");
            }minC++;
        }
    }
}
