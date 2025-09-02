public class IncrementExample {
    public static void main(String[] args) {
        int a = 5, b = 5;
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        // Pre-increment
        int x = ++a; // an is incremented first, then assigned to x
        System.out.println("Pre-increment: a = " + a + ", x = " + x); // a = 6, x = 6

        // Post-increment
        int y = b++; // b is assigned to y, then incremented
        System.out.printf(String.valueOf(arr[b])+"\n");
        System.out.println("Post-increment: b = " + b + ", y = " + y); // b = 6, y = 5
    }
}
