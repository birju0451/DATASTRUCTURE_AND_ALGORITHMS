package Basic_Java;

import java.util.Scanner;

public class _15_NumberedInputReader {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1: Scanner object created
        
        for (int i = 1; sc.hasNext(); i++) { // Step 2: Loop starts, checks if input exists
            String ans = sc.nextLine(); // Step 3: Reads one full line of input
            System.out.println(i + " " + ans); // Step 4: Prints line number and input
        }
        sc.close(); // Step 5: Closes the scanner
    }
}
