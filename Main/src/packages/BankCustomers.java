package packages;
import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    // Method to add an account
    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    // Method to show all balances
    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("Account Holder: " + account.getAccountHolderName() +
                    ", Account Number: " + account.getAccountNumber() +
                    ", Balance: " + account.getBalance());
        }
    }

    // Method to find an account by account number
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account found: " + account.getAccountHolderName() +
                        ", Account Number: " + account.getAccountNumber() +
                        ", Balance: " + account.getBalance());
                return account;
            }
        }
        System.out.println("Account with number " + accountNumber + " not found.");
        return null;
    }
}