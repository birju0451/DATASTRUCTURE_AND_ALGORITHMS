public class Main {
    public static void main(String[] args) {
        // 1. Pre-Increment and Pre-Decrement
        int a = 5;
        int b = ++a; // a becomes 6 first, then b = 6
        System.out.println("Pre-Increment: a = " + a + ", b = " + b);

        int c = --a; // a becomes 5 first, then c = 5
        System.out.println("Pre-Decrement: a = " + a + ", c = " + c);

        // 2. Post-Increment and Post-Decrement
        int x = 5;
        int y = x++; // y = 5, then x becomes 6
        System.out.println("Post-Increment: x = " + x + ", y = " + y);

        int z = x--; // z = 6, then x becomes 5
        System.out.println("Post-Decrement: x = " + x + ", z = " + z);

        // 3. Inside a for loop
        System.out.print("For loop with i++: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nFor loop with ++i: ");
        for (int i = 0; i < 3; ++i) {
            System.out.print(i + " ");
        }

        // 4. Inside while loop
        int i = 0;
        System.out.print("\nWhile loop with i++: ");
        while (i++ < 3) {
            System.out.print(i + " "); // prints 1 2 3
        }

        int j = 0;
        System.out.print("\nWhile loop with ++j: ");
        while (++j < 3) {
            System.out.print(j + " "); // prints 1 2
        }

        // 5. With Arrays
        int[] arr = {10, 20, 30};
        int index = 0;
        System.out.println("\nArray access with i++: " + arr[index++]); // 10
        System.out.println("Array access with ++i: " + arr[++index]);   // 30

        // 6. In Expressions
        int m = 5;
        int result1 = m++ + 10; // result1 = 5 + 10 = 15, m = 6
        System.out.println("Post-Increment in expression: m = " + m + ", result1 = " + result1);

        int result2 = ++m + 10; // m = 7, result2 = 17
        System.out.println("Pre-Increment in expression: m = " + m + ", result2 = " + result2);

        // 7. Wrong usage example
        int r = 0;
        int[] queue = new int[5];
        // queue[r+1] = 100; // ❌ risky: r is 0, r+1=1 assigned without r increment
        r++; // ✅ first increment
        queue[r] = 100;
        System.out.println("Safe array assign with r++: queue[1] = " + queue[1]);
    }
}