package Basic_Java;
public class _02_FindAreaOfCircle {
    public static void main(String[] args) {
        double rad;
        final double PI=3.14159;
        rad=10.0;
        double area=PI*rad*rad;
        System.out.print("\nArea of Circle = "+ String.format("%.2f", area));
    }
}
