// Base class: BankAccount
class BankAccount {
    public String accountNumber;    // Public: Accessible anywhere
    protected String accountHolder; // Protected: Accessible in subclasses
    private double balance;         // Private: Encapsulated, accessed via getter/setter

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (with validation)
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid amount! Balance cannot be negative.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount (demonstrating protected & public access)
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display Savings Account details
    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Public: Accessible
        System.out.println("Account Holder: " + accountHolder); // Protected: Accessible in subclass
        System.out.println("Balance: $" + getBalance()); // Accessing private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        account1.displayAccountDetails();

        // Performing transactions
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("Updated Balance: $" + account1.getBalance());

        System.out.println("\n------------------\n");

        // Creating a SavingsAccount object
        SavingsAccount savings1 = new SavingsAccount("987654321", "Alice Smith", 2000.0, 3.5);
        savings1.displaySavingsDetails();
    }
}
