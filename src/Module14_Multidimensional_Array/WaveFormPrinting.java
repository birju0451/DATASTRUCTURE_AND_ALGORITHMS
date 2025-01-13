package Module14_Multidimensional_Array;

public class WaveFormPrinting {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        System.out.println("original Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        //input
        /*
        input:- output:-
        1 2 3   1 2 3
        4 5 6   6 5 4
        7 8 9   7  8 9
         */
        for (int i = 0; i < m; i++) {
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]=arr[i][j];
                }
            }else{
                for (int j = 0; j <m/2; j++) {
                   int temp=arr[i][j];
                   arr[i][j]=arr[i][m-1-j];
                   arr[i][m-1-j]=temp;
                }
            }
        }
        System.out.println("\nWaveform array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
