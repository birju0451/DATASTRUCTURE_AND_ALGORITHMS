package Basic_Java;
import java.io.*;
public class _21_Simple_Sum {
    public static void main(String[] args) {
        int num1, num2, sum;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);

        sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
