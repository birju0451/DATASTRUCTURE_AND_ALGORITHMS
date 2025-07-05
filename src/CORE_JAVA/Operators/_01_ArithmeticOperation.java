package Operators;

public class _01_ArithmeticOperation {
    public static void main(String[] args) {
        int a = 25, b = 10;
        float c = 25.5f, d= 4.0f;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);

        System.out.println(" a + b = " + ( a + b ) );
        System.out.println(" a - b = " + ( a - b ) );
        System.out.println(" a * b = " + ( a * b ) );
        System.out.println(" a % b = " + ( a % b ) );
        System.out.println(" a / b = " + ( a / b ) );
        System.out.println(" a + c = " + ( a + c ) );
        System.out.println(" c + d = " + ( c + d ) );
        System.out.println(" c % d = " + ( c % d ) );

        System.out.println(" -a % b = " + ( -a % b ));
        System.out.println(" -a % -b = " + ( -a % -b ));
        System.out.println(" a % b = " + ( a % b ));
        System.out.println(" a % -b = " + ( a % -b ));
    }
}
