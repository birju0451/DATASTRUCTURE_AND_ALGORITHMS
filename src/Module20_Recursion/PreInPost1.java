package Module20_Recursion;

public class PreInPost1 {
    public static void pip(int n){
        if(n==0) return;
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        pip(3);
    }
}
