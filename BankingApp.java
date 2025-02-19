import java.util.*;

class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>(); 
    private Queue<String> withdrawalQueue = new LinkedList<>(); 

   
    void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

     void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, accounts.get(accountNumber) + amount);
            System.out.println("Deposited $" + amount + " into Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
            System.out.println("Withdrawal request added for Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

     void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account " + accountNumber);
        }
    }

    void displayAccountsSortedByBalance() {
        TreeMap<Double, String> sortedAccounts = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " - Balance: $" + entry.getKey());
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount("A101", 5000);
        bank.addAccount("A102", 12000);
        bank.addAccount("A103", 7500);

        bank.deposit("A101", 2000);
        bank.deposit("A103", 1500);

            bank.requestWithdrawal("A102");
        bank.requestWithdrawal("A101");

            bank.displayAccountsSortedByBalance();

   
        bank.processWithdrawals();
    }
}


