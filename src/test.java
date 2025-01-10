public class test {
    public static void main(String[] args) {
        int n = 10;

        while (n-- > 1) {
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
