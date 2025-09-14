package Module38_DYNAMIC_PROGRAMMING1;

public class Leetcode_Square_Subatrices{
    public static int countSquares(int[][] arr){
        int m = arr.length,n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n;j++) {
                if(arr[i][j] == 0) continue;
                if(i!=0 && j!=0){
                    arr[i][j] +=Math.min(arr[i][j-1],Math.min(arr[i-1][j-1],arr[i-1][j]));
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n;j++) {
                count +=arr[i][j];
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
