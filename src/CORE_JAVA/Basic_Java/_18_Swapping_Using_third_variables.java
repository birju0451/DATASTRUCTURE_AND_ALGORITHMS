package Basic_Java;

public class _18_Swapping_Using_third_variables {
    public static void main(String[] args) {
        int a, b, temp;

        a=10;
        b=20;
        System.out.println("Before Swapping :");
        System.out.println(a + "  " + b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("After  Swapping :");
        System.out.println(a + "  " + b);
    }
}
