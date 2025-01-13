package Module13_Array_And_ArrayList;

public class ToSum {
    public static void main(String[] args) {
        int[] arr={2,5,7,-1};
        int x=9;
        int a=0,b=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==x){
                     a=i;
                     b=j;
                    break;
                }
            }
        }
        System.out.println(a+" "+b);
    }
}
