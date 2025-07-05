package Basic_Java;

import java.util.Scanner;


public class _22_Return_Statement {

    public static void print(){
        System.out.println();
    }
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking an integer input from the user
        int a = sc.nextInt();

        if (a == 10) {
            print();
        }

        // This line will always execute before the return statement
        System.out.println("Before return.");

        // Checking if 'a' is equal to 10
        if (a == 10) {
            // Exits the method if the condition is met, skipping the remaining code
            return;
        }

        // This line will only execute if 'a' is not equal to 10
        System.out.println("After return");
    }
}
