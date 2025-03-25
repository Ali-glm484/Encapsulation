package packages;

public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Abstract method to calculate interest
    public abstract void calculateInterest();

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " added to account " + accountNumber);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}