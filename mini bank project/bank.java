import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bank {
    static final String DATA_FILE = "accounts.dat"; // File to save account data
    static Scanner scanner = new Scanner(System.in); // For user input
    static List<account> accounts = loadAccounts(); // Load existing accounts at startup

    public static void main(String[] args) {
        // Automatically save accounts when the program exits
        Runtime.getRuntime().addShutdownHook(new Thread(() -> saveAccounts()));

        int choice = 0;
        do {
            showMenu();
            System.out.print("Choose an option: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> viewBalances();
                case 5 -> viewTransactionshistory();
                case 6 -> System.out.println("Thanks for using Mini Bank");
                case 7 -> listAllAccounts();
                default -> System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 6);
    }

    static void showMenu() {
        System.out.println("\n===== Mini Bank Menu =====");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. View Balance");
        System.out.println("5. View Transaction History");
        System.out.println("7. List All Accounts");
        System.out.println("6. Exit");
    }

    static void createAccount() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();

        if (findAccount(accNo) != null) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        accounts.add(new account(accNo, name));
        System.out.println("Account created successfully!");
    }

    static void depositMoney() {
        account acc = getAccountByUser();
        if (acc == null) return;

        System.out.print("Enter amount to deposit: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        acc.deposit(amount);
    }

    static void withdrawMoney() {
        account acc = getAccountByUser();
        if (acc == null) return;

        System.out.print("Enter amount to withdraw: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        acc.withdraw(amount);
    }

    static void viewBalances() {
        account acc = getAccountByUser();
        if (acc != null) {
            System.out.printf("Balance: $%.2f%n", acc.getBalance());
        }
    }

    static void viewTransactionshistory() {
        account acc = getAccountByUser();
        if (acc != null) {
            acc.printTransactions();
        }
    }

    static account getAccountByUser() {
        System.out.print("Enter your account number: ");
        String accNo = scanner.nextLine();
        account acc = findAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found!");
        }
        return acc;
    }

    static account findAccount(String accNo) {
        for (account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    static void saveAccounts() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            out.writeObject(accounts);
            System.out.println("Accounts saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save accounts: " + e.getMessage());
        }
    }

    static List<account> loadAccounts() {
        File file = new File(DATA_FILE);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            return (List<account>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed to load accounts: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    static void listAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.println("\nList of All Accounts:");
        for (account acc : accounts) {
            System.out.printf("Account Number: %s | Holder: %s | Balance: $%.2f%n",
                    acc.getAccountNumber(), acc.getAccountHolderName(), acc.getBalance());
        }
    }
}
