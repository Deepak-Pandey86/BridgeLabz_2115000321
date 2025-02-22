import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BankAccount {
    private double balance;


    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }


    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }


    public double getBalance() {
        return balance;
    }
}


class BankAccountTest {
    private BankAccount account;


    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0);
    }


    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }


    @Test
    void testWithdrawSuccess() {
        assertTrue(account.withdraw(50.0));
        assertEquals(50.0, account.getBalance());
    }


    @Test
    void testWithdrawFailDueToInsufficientFunds() {
        assertFalse(account.withdraw(200.0));
        assertEquals(100.0, account.getBalance());
    }
}
