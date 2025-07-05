package Basic_Java;

public class _04_ConvertRpeesIntoPaisa {
    public static void main(String[] args) {
        double n=56.50;
        int a=(int)n;
        double p=(n-a)*100;//
        System.out.println("Rs :"+a);
        System.out.println("paisa :"+(int)p);
    }
}
