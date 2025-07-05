package Basic_Java;
import java.io.Console;
public class _20_Input_using_console
{
    public static void main(String[] args)
    {
        Console cn = System.console();
        int n;

        System.out.println("Enter a Number :");
        n = Integer.parseInt(cn.readLine());


        System.out.println("The given number is : "+ n);
    }
}
