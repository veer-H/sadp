// InterestCalculator interface
interface InterestCalculator {
    double calculateInterest();
}

// Account class implementing InterestCalculator
class Account implements InterestCalculator {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public double calculateInterest() {
        return balance * 0.03;  // 3% interest for general account
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

// SavingsAccount class implementing InterestCalculator
class SavingsAccount implements InterestCalculator {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;  // 5% interest for savings account
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class A_3_que_3 {
    public static void main(String[] args) {
        Account account = new Account(1000);
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        System.out.println("Account interest: " + account.calculateInterest());
        System.out.println("SavingsAccount interest: " + savingsAccount.calculateInterest());
    }
}
