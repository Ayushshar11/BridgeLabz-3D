// BankAccounts.java
// Demonstrates hierarchical inheritance with BankAccount and its subclasses.

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term; // in months

    FixedDepositAccount(int accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Term: " + term + " months");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount(1001, 5000, 3.5);
        BankAccount c = new CheckingAccount(1002, 3000, 1000);
        BankAccount f = new FixedDepositAccount(1003, 20000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
