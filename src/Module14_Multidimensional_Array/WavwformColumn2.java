package Module14_Multidimensional_Array;

public class WavwformColumn2 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length,n=arr[0].length;
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
        for (int j = 0; j < m; j++) {
            if(j%2!=0) {
                for (int i = 0; i < m; i++) {
                    arr[i][j]=arr[i][j];
                }
            }else{
                for (int i = 0; i <m/2; i++) {
                    int temp=arr[i][j];
                    arr[i][j]=arr[m-1-i][j];
                    arr[m-1-i][j]=temp;
                }
            }
        }
        System.out.println("\nWaveform array:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j]+" ");
            }
        }

    }
}
