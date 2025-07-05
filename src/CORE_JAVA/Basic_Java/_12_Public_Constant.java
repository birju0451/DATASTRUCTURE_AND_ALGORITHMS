// Package declaration, which groups related classes together
package Basic_Java;

/* Java does not have a specific constant datatype.
   Java uses final, static final, and enum to define constants.
*/

// A class to define constants
class MyConstant {
    // Defining a constant variable for the number of months in a year
    public static final int NUMBER_OF_MONTH = 12;

    // Defining a constant for PI, calculated as 22/7 (approximation)
    // It is declared as 'double' to store decimal values
    public static double PI = (double) 22 / 7;
}

// Main class to demonstrate the use of constants
public class _12_Public_Constant {

    public static void main(String[] args) {
        // Printing the constant NUMBER_OF_MONTH from MyConstant class
        System.out.println("NUMBER_OF_MONTHS: " + MyConstant.NUMBER_OF_MONTH);

        // Printing the constant PI from MyConstant class
        System.out.println("PI: " + String.format("%.2f", MyConstant.PI));
        System.out.println(MyConstant.PI);
    }
}
