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

}

class Main {
    public static void main(String[] args) {
        System.out.println("I finally got Java in Visual studio code");
    }
}