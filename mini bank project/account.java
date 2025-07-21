import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class account implements Serializable {
    private String accountNumber;
    private String holderName;
    private double balance;
    private List<transactions> transactions;

    public account(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new transactions("Deposit", amount));
        System.out.println("Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        transactions.add(new transactions("Withdraw", amount));
        System.out.println("Withdrew $" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("Transaction History:");
        for (transactions t : transactions) {
            System.out.println(t);
        }
    }
    public String getAccountHolderName() {
        return holderName;
    }
}
