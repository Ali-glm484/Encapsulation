package packages;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500; // Overdraft limit of 500

    // Constructor
    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    // Method to calculate interest (no interest for transaction accounts)
    @Override
    public void calculateInterest() {
        System.out.println("No interest for transaction account " + getAccountNumber());
    }

    // Override withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overDraftLimit)) {
            balance -= amount;
            System.out.println(amount + " withdrawn from account " + getAccountNumber());
        } else {
            System.out.println("Invalid amount for withdrawal or exceeds overdraft limit.");
        }
    }
}