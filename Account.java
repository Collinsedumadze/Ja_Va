public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;


    public Account(String accountNumber, double balance, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;

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
            }else {
                System.out.println("Invalid account type. Must be 'Savings' or" +
                        "'Current'");
            }
        }
    
        public void deposit (double amount){
            if (amount > 0){
                balance +=amount;
                System.out.println("Deposit successful. New balance: " + balance);
            }else{
                System.out.println("Invalid deposit amount");
            }
        }
    
        public void withdraw (double amount){
            if (amount <= balance){
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }else {
                System.out.println("Insufficient balance");
            }
        }
    
    
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println("I finally got Java in Visual studio code");

        Account acc = new Account("526362366",3.57,"Collins", "reciever");
        // acc is one of the account from the Account class
    }
}