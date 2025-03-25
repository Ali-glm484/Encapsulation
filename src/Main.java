import packages.BankCustomers;
import packages.SavingsAccount;
import packages.TransactionAccount;

public class Main {
    public static void main(String[] args) {
        // Create a bank
        BankCustomers bank = new BankCustomers();

        // Create some accounts
        SavingsAccount savingsAccount1 = new SavingsAccount("SA001", "Ali", 1000);
        SavingsAccount savingsAccount2 = new SavingsAccount("SA002", "Reza", 2000);
        TransactionAccount transactionAccount1 = new TransactionAccount("TA001", "Maryam", 1500);
        TransactionAccount transactionAccount2 = new TransactionAccount("TA002", "Hossein", 2500);

        // Add accounts to the bank
        bank.addAccount(savingsAccount1);
        bank.addAccount(savingsAccount2);
        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);

        // Find an existing account and a non-existing account
        bank.findAccount("SA001");
        bank.findAccount("SA003");

        // Deposit and print balance
        savingsAccount1.deposit(500);
        System.out.println("New balance for SA001: " + savingsAccount1.getBalance());

        // Try to deposit an invalid amount
        savingsAccount1.deposit(-100);

        // Calculate interest for savings accounts
        savingsAccount1.calculateInterest();
        savingsAccount2.calculateInterest();

        // Withdraw from transaction accounts
        transactionAccount1.withdraw(200);
        transactionAccount2.withdraw(3000); // This should fail due to overdraft limit

        // Show all balances
        bank.showAllBalances();
    }
}