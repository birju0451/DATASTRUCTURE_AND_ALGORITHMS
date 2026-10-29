package ExceptionHandling;
/*
Type of Error
1.Syntax error - wrong syntax error
2.Logical error - write wrong logic during writing a program
3.RunTime error -  its occur during execution of a program and interrupt the normal flow of program

"Exception handling is the way to handle the runtime error so that the normal flow of the application can maintain

*/
public class _01_Exception_Example {

    public static void main(String[] args) {
        int[] numerator = {102,405,302,452,502};
        int[] denominator = {14,24,0,47,58};

        for (int i = 0; i < numerator.length; i++) {
            devide(numerator[i],denominator[i]);
        }
    }

    private static void devide(int numerator, int denominator) {
        try {
            System.out.println(numerator/denominator);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
