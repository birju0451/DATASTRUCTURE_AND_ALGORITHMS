package CORE_JAVA.Operators;

public class Logical_BitWise_Operators {
    public static void main(String[] args) {
        int a = 3, b = 6,c;
        System.out.println("a =" + a);
        System.out.println("b =" + b);

        c = a & b;
        System.out.println("a & b ="+c);

        c = a | b;
        System.out.println("a | b ="+c);

        c = a ^ b;
        System.out.println("a ^ b ="+c);

        c = ~b;
        System.out.println("~b  = "+c);
    }
}
