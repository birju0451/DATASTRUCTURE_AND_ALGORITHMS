package Basic_Java;

public class _03_AreaOfTriangle {
    public static void main(String[] args) {
        double area , a,b,c,s;
        a=3;b=4;c=5;
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-c));
        System.out.println("Area of trangle is = "+String.format("%.2f",area));
    }
}
