public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public Account() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType.equals("Savings") || accountType.equals("Current")) {
            this.accountType = accountType;
        } else {
            System.out.println("Invalid account type. Must be 'Savings' or 'Current'");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("I finally got Java in Visual Studio Code");

        Account acc = new Account();
        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();
        Account acc4 = new Account();
        System.out.println(acc.getAccountNumber());
        System.out.println(acc4.getAccountNumber());
        System.out.println(acc2.getAccountHolderName());
        
    }
}