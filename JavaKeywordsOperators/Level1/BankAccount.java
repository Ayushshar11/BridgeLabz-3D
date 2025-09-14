package Level1;
public class BankAccount {
    static String bankName = "SBI";
    static int totalAccounts = 0;

    private final String accNo;
    private String holder;
    private double bal;

    public BankAccount(String holder, String accNo, double bal) {
        this.holder = holder;
        this.accNo = accNo;
        this.bal = bal;
        totalAccounts++;
    }

    public static void showTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void showDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + holder);
            System.out.println("AccNo: " + accNo);
            System.out.println("Balance: " + bal);
        }
    }

    public void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Amit", "A101", 2000);
        BankAccount a2 = new BankAccount("Riya", "A102", 5000);

        a1.showDetails();
        a2.showDetails();
        BankAccount.showTotalAccounts();

        a1.deposit(500);
        a1.withdraw(1000);
        a1.showDetails();
    }
}
