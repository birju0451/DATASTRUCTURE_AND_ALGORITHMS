package Basic_Java;

public class _24_Difference_Between_Exit_And_Return {
    public static void main(String[] args) {
        System.out.println("Before return");

        // Calling method that uses return
        testMethod();

        System.out.println("After return"); // This will execute after testMethod() returns

        System.out.println("Before exit");

        // Calling System.exit(0) to terminate the program
        System.exit(0);

        System.out.println("After exit"); // This will never execute
    }

    static void testMethod() {
        System.out.println("Inside testMethod");

        // Returning from the method (only exits this method, not the program)
        return;

        // This line is unreachable because of return
        // System.out.println("This won't print");
    }
}
