package Module23_OPPS.ClassesAndObject;

public class TestClass {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.0);
        System.out.println("Current Balance: " + acc.getBalance());
    }
}
