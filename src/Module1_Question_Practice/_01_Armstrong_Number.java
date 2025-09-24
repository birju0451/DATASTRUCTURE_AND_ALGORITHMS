package Module1_Question_Practice;

public class _01_Armstrong_Number {
    public static void main(String[] args) {
        int n = 153;
        String s = Integer.toString(n);
        int p = s.length();
        int temp = n;
        int arm = 0;
        while (n > 0) {
            int digit = n % 10;
            arm +=Math.pow(digit, p);
            n /= 10;
        }
        if (arm == temp)
            System.out.println(temp + " is an Armstrong Number");
        else
            System.out.println(temp + " is not an Armstrong Number");
    }
}
