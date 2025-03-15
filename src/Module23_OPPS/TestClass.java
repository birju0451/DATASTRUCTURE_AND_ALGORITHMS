package Module23_OPPS;

class Account {
    // Data security
    private double balance;

    // Getter method (Corrected)
    public double getBalance() {
        return this.balance;
    }

    // Setter method with authentication
    public void setBalance(double balance) {
        // Perform authentication
        boolean result = validate("sachin", "sachin123");

        if (result) {
            // Deposit the money
            this.balance += balance;
            System.out.println("Credited to the account. New balance: " + this.balance);
        } else {
            // Throw a meaningful message to the user
            System.out.println("Invalid username/password. Try again.");
        }
    }

    // Private authentication method
    private boolean validate(String userName, String password) {
        // Logic for authentication
        return userName.equalsIgnoreCase("sachin") && password.equals("sachin1233");
    }
}

public class TestClass {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.0);
        System.out.println("Current Balance: " + acc.getBalance());
    }
}
