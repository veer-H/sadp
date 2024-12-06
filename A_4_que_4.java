// Real BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Proxy class to control access to BankAccount
class BankAccountProxy {
    private BankAccount bankAccount;

    public BankAccountProxy(double balance) {
        bankAccount = new BankAccount(balance);
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    public void withdraw(double amount) {
        if (bankAccount.getBalance() >= amount) {
            bankAccount.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied due to insufficient funds.");
        }
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }
}

public class A_4_que_4 {
    public static void main(String[] args) {
        BankAccountProxy accountProxy = new BankAccountProxy(1000);

        accountProxy.deposit(500);
        accountProxy.withdraw(1200);  // Withdrawal should fail
        accountProxy.withdraw(800);   // Withdrawal should succeed
    }
}
