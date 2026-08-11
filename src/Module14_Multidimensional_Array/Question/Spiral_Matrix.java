package Module14_Multidimensional_Array.Question;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{6,7,8}};
        int[][] brr = new int[3][3];
        int minR = 0,maxR = 2;
        int minC = 0,maxC = 2;


        while(minR <= maxR && minC <= maxC){
            for(int j=minC;j<=maxC;j++){
                brr[minR][j]=arr[minR][j];
            }
            minR++;

            for(int i=minR;i<=maxR;i++){
                brr[i][maxC]=arr[i][maxC];
            }
            maxC--;

            //right to left
            if(minC <= maxC){
                for(int j=maxC;j>=minC;j--){
                    brr[maxR][j]=arr[maxR][j];
                }
            }

            if(minR<=maxR){
                for(int i=maxR;i>=minR;i--){
                    brr[i][minC]=arr[i][minC];
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(brr[i][j]);
            }
        }
    }
}
