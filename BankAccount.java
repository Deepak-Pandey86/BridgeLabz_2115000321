class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Bob", 1002, 7500.0);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
