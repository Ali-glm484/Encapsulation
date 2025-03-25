package packages;

public class SavingsAccount extends BankAccount {
    private final double interestRate = 0.03; // 3% interest rate

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    // Method to calculate interest
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest of " + interest + " added to savings account " + getAccountNumber());
    }
}